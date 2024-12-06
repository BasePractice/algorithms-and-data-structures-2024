package ru.mirea.practice.s0000001.n1;

class ConcrFactory implements ComxAbsFactory {
    @Override
    public Comx createComx() {
        return new Comx();
    }

    @Override
    public Comx createComx(int r, int i) {
        return new Comx(r, i);
    }
}
