package ru.mirea.practice.s23K0135.prog12;

// Команда для вставки
class InsertCommand implements Command {
    private final int offset;
    private final String str;

    public InsertCommand(int offset, String str) {
        this.offset = offset;
        this.str = str;
    }

    @Override
    public void execute(StringBuilder sb) {
        sb.insert(offset, str);
    }

    @Override
    public void undo(StringBuilder sb) {
        sb.delete(offset, offset + str.length());
    }
}
