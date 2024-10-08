package ru.mirea.practice.s23K0135.prog13;


class ConsoleObserver implements Observer {
    @Override
    public void update(StringBuilder sb, ObservableStringBuilder observable) {
        System.out.println("StringBuilder изменен: " + observable.print(sb));
    }
}
