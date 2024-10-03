package ru.mirea.practice.s0000002;

/***************************************************************************
 * По диаграмме класса UML описывающей сущность Автор.                     *
 * Необходимо написать программу, которая состоит из двух классов Author и *
 * TestAuthor. Класс Author должен содержать реализацию методов,           *
 * представленных на диаграмме класса на рисунке 2.4.                      *
 ***************************************************************************/

public abstract class Task1 {
    public static void main(String[] args) {
        TestAuthor tester = new TestAuthor();

        tester.testCreation();
        System.out.println();

        tester.testGetName();
        System.out.println();

        tester.testGetEmail();
        System.out.println();

        tester.testSetEmail();
        System.out.println();

        tester.testGetGender();
    }

    static class Author {
        private final String name;
        private String email;
        private final char gender;

        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public char getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Author { name='" + name + "', email='" + email + "', gender=" + gender + " }";
        }
    }

    static class TestAuthor {
        void testCreation() {
            Author author = new Author("Gleb", "golubi@global.mail", 'M');

            System.out.println("Был создан автор: " + author);
        }

        void testGetName() {
            Author author = new Author("Gleb", "golubi@global.mail", 'M');

            System.out.println("Был создан автор: " + author);

            System.out.println("Его имя: " + author.getName());
        }

        void testGetEmail() {
            Author author = new Author("Gleb", "golubi@global.mail", 'M');

            System.out.println("Был создан автор: " + author);

            System.out.println("Его email: " + author.getEmail());
        }

        void testSetEmail() {
            Author author = new Author("Gleb", "golubi@global.mail", 'M');

            System.out.println("Был создан автор: " + author);

            System.out.println("Его email: " + author.getEmail());

            author.setEmail("gleb@mail.ru");

            System.out.println("Его новый email: " + author.getEmail());
            System.out.println("Новые данные: " + author);
        }

        void testGetGender() {
            Author author = new Author("Gleb", "golubi@global.mail", 'M');

            System.out.println("Был создан автор: " + author);

            System.out.println("Его имя: " + author.getGender());
        }
    }
}
