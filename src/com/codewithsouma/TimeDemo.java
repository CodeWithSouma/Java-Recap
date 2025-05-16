package com.codewithsouma;

import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeDemo {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formatted = formatter.format(time);
        System.out.println(formatted);

    }
}
