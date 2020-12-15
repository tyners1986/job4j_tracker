package ru.job4j.oop;

public class Doctor extends Profession {
    private String diagnosis;

    public String getDiagnosis () { return diagnosis; }

    public static void main(String[] args) {
        Profession name = new Profession();
        System.out.println(name.getName());
    }


}
