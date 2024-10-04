package ru.mirea.practice.s0000001.prog13;


class ConsoleObserver implements Observer {
    @Override
    public void update(StringBuilder sb, ObservableStringBuilder observable) {
        System.out.println("StringBuilder изменен: " + observable.print(sb));
    }
}