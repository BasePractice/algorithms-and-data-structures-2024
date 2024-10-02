package ru.mirea.practice.s0000001;

/**
 * Создайте в draw.io UML диаграмму и напишите по ней реализацию.
 * Диаграмма должна включать в себя следующие элементы: интерфейс Movable,
 * содержащий в себе методы для движения прямоугольника (вверх, вниз, влево,
 * вправо) и класс MovableRectangle (движущийся прямоугольник), реализующий
 * интерфейс Movable.
 * <br>
 * Note: UML не делать.
 */

public class Task1 {
    interface Moveable {
        void moveUp();

        void moveDown();

        void moveRight();
        
        void moveLeft();
    }

    static class MoveableRectangle implements Moveable {
        @Override
        public void moveUp() {
            throw new RuntimeException("Not implemented");
        }

        @Override
        public void moveDown() {
            throw new RuntimeException("Not implemented");
        }

        @Override
        public void moveRight() {
            throw new RuntimeException("Not implemented");
        }

        @Override
        public void moveLeft() {
            throw new RuntimeException("Not implemented");
        }
    }
}
