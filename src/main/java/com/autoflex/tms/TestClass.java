package com.autoflex.tms;

import java.time.LocalDate;
import java.time.Month;

public class TestClass {
    public static void main(String[] args) {
        String[] a = new String[2];
        LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
        System.out.println(date.getYear() + " " + date.getMonth() + " "
                + date.getDayOfMonth());
        int b = a.length;
    }
    }