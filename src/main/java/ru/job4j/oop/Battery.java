package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery (int size) {
        this.load = size;
    }

    public void exchange(Battery another){
        this.load -= another.load;

    }

    Battery first = new Battery(50);





}
