package ru.mirea.practice.s230k754.lab4.task2;


public class Atelier implements MenClothing, WomenClothing {
    private Object[] typeClothes;

    Atelier(Object[] typeClothes) {
        this.typeClothes = typeClothes;
    }

    @Override
    public void dressWomen() {
        for (Object item: typeClothes) {
            if (item instanceof TShirt) {
                TShirt tShirt = (TShirt) item;
                tShirt.dressWomen();
            } else if (item instanceof Pants) {
                Pants pants = (Pants) item;
                pants.dressWomen();
            } else if (item instanceof Skirt) {
                Skirt skirt = (Skirt) item;
                skirt.dressWomen();
            }
        }
    }

    @Override
    public void dressMan() {
        for (Object item: this.typeClothes) {
            if (item instanceof TShirt) {
                TShirt tShirt = (TShirt) item;
                tShirt.dressMan();
            } else if (item instanceof Pants) {
                Pants pants = (Pants) item;
                pants.dressMan();
            } else if (item instanceof Tie) {
                Tie tie = (Tie) item;
                tie.dressMan();
            }
        }
    }
}
