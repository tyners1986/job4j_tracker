package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book buratino = new Book("Buratino", 20);
        Book karloson = new Book("karloson", 50);
        Book war = new Book("War", 100);
        Book cleanCode = new Book("Clean code", 500);
        Book[] fin = new Book[4];
        fin[0] = buratino;
        fin[1] = karloson;
        fin[2] = war;
        fin[3] = cleanCode;


        for (int i = 0; i < fin.length; i++) {
            Book clear = fin[i];
            System.out.println(clear.getName() + "-" + clear.getPage());

        }

        System.out.println("Перенос местами");
        Book tmp = fin[0];
        fin[0] = fin[3];
        fin[3] = tmp;
        for (int i = 0; i < fin.length; i++) {
            Book clear = fin[i];
            if (clear.getName().equals("Clean code")) {
                System.out.println("книга" + " " + clear.getName());
            }
        }
    }
}
