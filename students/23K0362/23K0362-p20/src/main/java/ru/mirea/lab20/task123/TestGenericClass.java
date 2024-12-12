package mirea.lab20.task123;

abstract class TestGenericClass {
    public static void main(String[] args) {
        GenericClass<String, Animal, Integer> genericClassExample = new GenericClass<>("Example",
                new Animal("Жужелик", "Собака", 5), 5);

        genericClassExample.printNamesClasses();
        System.out.println(genericClassExample.getKey());
        System.out.println(genericClassExample.getValue());
        System.out.println(genericClassExample.getTend());
        genericClassExample.setKey(132456);
        genericClassExample.setTend("Example 2");
        genericClassExample.setValue(new Animal("Жужа", "Собака", 1));
        System.out.println(genericClassExample);
    }
}
