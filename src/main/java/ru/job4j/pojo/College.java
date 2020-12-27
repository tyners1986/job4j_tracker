package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student Student = new Student();
        Student.setFio("Petr Arsentev");
        Student.setGroup(5);
        Student.setEntrance(new Date());

        System.out.println(Student.getFio() + " Группа - " + Student.getGroup() + " : " + Student.getEntrance());
    }
}
