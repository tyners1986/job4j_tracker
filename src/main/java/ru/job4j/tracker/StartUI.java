package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item fin = new Item();
        Item target = new Item();
        System.out.println(fin.toString());
        LocalDateTime sec = target.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = sec.format(formatter);
        System.out.println(currentDateTimeFormat);
    }

}
