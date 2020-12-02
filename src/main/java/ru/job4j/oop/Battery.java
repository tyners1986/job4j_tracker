package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery (int size) {
        this.load = size;
    }

    public void exchange(Battery another){
        this.load -= another.load;

    }

    public static void main(String[] args) {
        Battery sec = new Battery(100);
        Battery first = new Battery(30);
        sec.exchange(first);
        System.out.println(sec.load);
    }


}
