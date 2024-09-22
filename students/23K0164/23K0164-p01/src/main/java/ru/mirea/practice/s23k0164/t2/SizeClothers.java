package ru.mirea.practice.s23k0164.t2;

public class SizeClothers {
    public enum ListSize {
        Size1("XXS", "Детский размер", 32),
        Size2("XS", "Взрослый размер", 34),
        Size3("S", "Взрослый размер", 36),
        Size4("M", "Взрослый размер", 38),
        Size5("L", "Взрослый размер", 40);


        private final String size;
        private final String description;
        private final int euroSize;


        ListSize(String size, String description, int euroSize) {
            this.size = size;
            this.description = description;
            this.euroSize = euroSize;
        }

        public String getSize() {
            return size;
        }

        public String getDescription() {
            return description;
        }

        public int getEuroSize() {
            return euroSize;
        }

        public static ListSize euroSizePut(int euroSize) {
            if (euroSize <= 32) {
                return Size1;
            } else if (euroSize == 34) {
                return Size2;
            } else if (euroSize == 36) {
                return Size3;
            } else if (euroSize == 38) {
                return Size4;
            } else {
                return Size5;
            }
        }
    }
}
