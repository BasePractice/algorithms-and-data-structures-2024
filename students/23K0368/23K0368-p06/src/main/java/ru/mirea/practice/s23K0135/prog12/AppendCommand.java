package ru.mirea.practice.s23K0135.prog12;

// Команда для добавления
class AppendCommand implements Command {
    private final String str;

    public AppendCommand(String str) {
        this.str = str;
    }

    @Override
    public void execute(StringBuilder sb) {
        sb.append(str);
    }

    @Override
    public void undo(StringBuilder sb) {
        int start = sb.length() - str.length();
        sb.delete(start, sb.length());
    }
}
