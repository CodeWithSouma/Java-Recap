package com.codewithsouma;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = format.format(date);
        System.out.println(currentDate);
    }
}
