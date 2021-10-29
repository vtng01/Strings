package com.van;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(" ", "{ ", " }");
//        sj.setEmptyValue("HELLO");
        sj.add("hello").add("world");

        System.out.println(sj.toString());

        double avg = 1.0 / 3;
        System.out.println(avg);

        String s1 = String.format("the average value is %.1f", avg);
        System.out.println(s1);

        System.out.printf("the repeat average value is %.2f", avg);
    }
}
