package ru.job4j.oop;

public class Pacient extends Doctor {

    public static void main(String[] args) {
        Pacient diagnosis = new Pacient();
        System.out.println(diagnosis.getDiagnosis());
    }
}
