package com.kh.testEx.test2pre;

import java.util.ArrayList;

public class SnackRun {
    public static void main(String[] args) {
        Snack s1 = new Snack("포테토칩","짠맛",1500);
        Snack s2 = new Snack("초코파이","짠맛",1500);
        Snack s3 = new Snack("허니버터칩","짠맛",1500);
        ArrayList<Snack> snacks = new ArrayList<Snack>();
        snacks.add(s1);
        snacks.add(s2);
        snacks.add(s3);
            for (Snack s: snacks) {
                System.out.println(s);

        }


    }
}
