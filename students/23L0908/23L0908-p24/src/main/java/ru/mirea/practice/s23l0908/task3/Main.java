package ru.mirea.practice.s23l0908.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Main {

    private Main() {
    }

    public interface IDocument {

        String getTypeDocument();

        String getTitleDocument();

        String getPathDocument();
    }

    @SuppressWarnings("unused")
    public interface ICreateDocument {

        IDocument createNew(String type, String title, String path); // Fixed method name to match conventions

        IDocument createOpen(String type, String title, String path); // Fixed method name to match conventions
    }

    public static class Document {
        private String type;
        private String title;
        private String path;

        public Document(String type, String title, String path) {
            this.type = type;
            this.title = title;
            this.path = path;
        }

        public String getType() {
            return type;
        }

        @SuppressWarnings("unused")

        public void setType(String type) {
            this.type = type;
        }

        public String getTitle() {
            return title;
        }

        @SuppressWarnings("unused")
        public void setTitle(String title) {
            this.title = title;
        }

        public String getPath() {
            return path;
        }

        @SuppressWarnings("unused")

        public void setPath(String path) {
            this.path = path;
        }
    }

    public static class TextDocument extends Document implements IDocument {

        public TextDocument(String typeDocument, String titleDocument, String path) {
            super(typeDocument, titleDocument, path);
        }

        @Override
        public String getTypeDocument() {
            return this.getType();
        }

        @Override
        public String getTitleDocument() {
            return this.getTitle();
        }

        @Override
        public String getPathDocument() {
            return this.getPath();
        }
    }

    public static class ImageDocument extends Document implements IDocument {

        public ImageDocument(String typeDocument, String titleDocument, String path) {
            super(typeDocument, titleDocument, path);
        }

        @Override
        public String getTypeDocument() {
            return this.getType();
        }

        @Override
        public String getTitleDocument() {
            return this.getTitle();
        }

        @Override
        public String getPathDocument() {
            return this.getPath();
        }
    }

    public static class MusicDocument extends Document implements IDocument {

        public MusicDocument(String typeDocument, String titleDocument, String path) {
            super(typeDocument, titleDocument, path);
        }

        @Override
        public String getTypeDocument() {
            return this.getType();
        }

        @Override
        public String getTitleDocument() {
            return this.getTitle();
        }

        @Override
        public String getPathDocument() {
            return this.getPath();
        }
    }

    public static class FactoryDocument implements ICreateDocument {

        @Override
        public IDocument createNew(String type, String title, String path) { // Fixed method name
            if ("Text".equalsIgnoreCase(type)) {
                return new TextDocument(type, title, path);
            } else if ("Image".equalsIgnoreCase(type)) {
                return new ImageDocument(type, title, path);
            } else {
                return new MusicDocument(type, title, path);
            }
        }

        @Override
        public IDocument createOpen(String type, String title, String path) { // Fixed method name
            if ("Text".equalsIgnoreCase(type)) {
                return new TextDocument(type, title, path);
            } else if ("Image".equalsIgnoreCase(type)) {
                return new ImageDocument(type, title, path);
            } else {
                return new MusicDocument(type, title, path);
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            List<IDocument> list = new ArrayList<>();
            int menu;
            do {
                System.out.println("File");
                System.out.println("1. New");
                System.out.println("2. Open");
                menu = in.nextInt();
                in.nextLine();
                switch (menu) {
                    case 1: {
                        System.out.print("Enter the document type: ");
                        String type = in.nextLine();
                        System.out.print("Enter the document title: ");
                        String title = in.nextLine();
                        System.out.print("Enter the document path: ");
                        String path = in.nextLine();
                        list.add(new FactoryDocument().createNew(type, title, path));
                        System.out.println("Document created successfully!");
                        break;
                    }
                    case 2: { // Open an existing document
                        if (list.isEmpty()) {
                            System.out.println("No documents available to open.");
                        } else {
                            System.out.print("Enter the path of the document to open: ");
                            String path = in.nextLine();
                            boolean found = false;
                            for (var doc : list) {
                                if (doc.getPathDocument().equalsIgnoreCase(path)) {
                                    System.out.println(doc.getTypeDocument() + " Document:");
                                    System.out.println("Title: " + doc.getTitleDocument());
                                    System.out.println("Path: " + doc.getPathDocument());
                                    found = true;
                                    break;
                                }
                            }
                            if (!found) {
                                System.out.println("No document found with the specified path.");
                            }
                        }
                        break;
                    }
                    case 0: // Exit
                        System.out.println("Exiting the application. Goodbye!");
                        break;
                    default: // Invalid menu option
                        System.out.println("Invalid menu option. Please try again.");
                        break;
                }
            } while (menu != 0);
        }
    }
}

