package ru.mirea.practice.s23L0908.prog12;

// Команда для удаления
class DeleteCommand implements Command {
    private final int start;
    private final int end;

    public DeleteCommand(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void execute(StringBuilder sb) {
        sb.delete(start, end);
    }

    @Override
    public void undo(StringBuilder sb) {
        sb.insert(start, sb.substring(end, sb.length()));
    }
}
