import java.util.ArrayList;

public class Shop implements ShopInterface {
    private ArrayList<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    @Override
    public void addComputer(Computer computer) {
        computers.add(computer);
        System.out.println("Компьютер добавлен: " + computer);
    }

    @Override
    public void removeComputer(String model) {
        Computer toRemove = null;
        for (Computer comp : computers) {
            if (comp.getModel().equalsIgnoreCase(model)) {
                toRemove = comp;
                break;
            }
        }
        if (toRemove != null) {
            computers.remove(toRemove);
            System.out.println("Компьютер удален: " + toRemove);
        } else {
            System.out.println("Компьютер с моделью \"" + model + "\" не найден.");
        }
    }

    @Override
    public Computer findComputer(String model) {
        for (Computer comp : computers) {
            if (comp.getModel().equalsIgnoreCase(model)) {
                return comp;
            }
        }
        System.out.println("Компьютер с моделью \"" + model + "\" не найден.");
        return null;
    }

    public void displayComputers() {
        if (computers.isEmpty()) {
            System.out.println("Магазин пуст.");
        } else {
            System.out.println("Список компьютеров в магазине:");
            for (Computer comp : computers) {
                System.out.println(comp);
            }
        }
    }
}

