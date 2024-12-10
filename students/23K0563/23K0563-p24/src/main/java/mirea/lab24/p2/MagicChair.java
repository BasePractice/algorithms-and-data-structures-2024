package mirea.lab24.p2;

public class MagicChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Волшебный стул");
    }

    public void doMagic() {
        System.out.println("Магический стул делает магию\nshutdown -s -t 0");
    }
}
