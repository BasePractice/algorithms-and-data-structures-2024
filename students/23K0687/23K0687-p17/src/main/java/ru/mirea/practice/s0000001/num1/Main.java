package ru.mirea.practice.s0000001.num1;

public final class Main {

    private Main() {
        // Приватный конструктор
    }

    public static void main(String[] args) {
        ListContainer list = new ListContainer();
        boolean exit = false;
        while (!exit) {
            System.out.println("Меню:");
            System.out.println("1. Добавить элемент");
            System.out.println("2. Удалить элемент");
            System.out.println("3. Показать элемент");
            System.out.println("4. Очистить список");
            System.out.println("5. Сохранить список в файл");
            System.out.println("6. Загрузить список из файла");
            System.out.println("7. Выход");

            System.out.print("Выберите опцию: ");
            int option = Integer.parseInt(System.console().readLine());

            switch (option) {
                case 1:
                    list.addNode();
                    break;
                case 2:
                    list.removeNode();
                    break;
                case 3:
                    list.printNode();
                    break;
                case 4:
                    list.clearList();
                    break;
                case 5:
                    list.saveToFile();
                    break;
                case 6:
                    list.loadFromFile();
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Неверный выбор");
                    break;
            }
        }
    }
}
