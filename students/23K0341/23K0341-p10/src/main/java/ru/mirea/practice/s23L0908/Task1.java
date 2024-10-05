package ru.mirea.practice.s23L0908;

/**
 * Создать свой класс Student со всеми переменными экземпляра,
 * конструктором, включающим все переменные, предпочтительно использовать
 * геттеры и сеттеры для каждой переменной. Класс студент имеет свойства: Имя,
 * Фамилия, Специальность, Курс, Группа
 */

public class Task1 {
    static class Student {
        String name;
        String surname;
        String speciality;
        int course;
        String group;

        public Student(String name, String surname, String speciality, int course, String group) {
            this.name = name;
            this.surname = surname;
            this.speciality = speciality;
            this.course = course;
            this.group = group;
        }

        public int getCourse() {
            return course;
        }

        public String getGroup() {
            return group;
        }

        public String getName() {
            return name;
        }

        public String getSpeciality() {
            return speciality;
        }

        public String getSurname() {
            return surname;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCourse(int course) {
            this.course = course;
        }

        public void setSpeciality(String speciality) {
            this.speciality = speciality;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }
    }
}
