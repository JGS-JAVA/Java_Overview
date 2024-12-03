package com.kh.loopEx;

import java.util.Scanner;

public class loopRun {
    public static void main(String[] args) {
//        ForEx forEx = new ForEx();
//        forEx.method1();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        WhileEx whileEx = new WhileEx();
        int number = sc.nextInt();
        //int sc = new Scanner(System.in).nextInt(); // 한번에 쓰기
        whileEx.method1(number);

    }
}
