package com.kh.operatorEx;

public class OperatorPre {
    public static void main(String[] args) {
        System.out.println("전위 연산자");
        //계산 먼저하고 값 사용
        int a = 5;
        System.out.println("a:" + a);
        int result1 = ++a; // ++a = a+1 -> result1 에 대입
        System.out.println("a:" + a);
        System.out.println("result1:" + result1);

        System.out.println("후위 연산자");
        //값 사용후 계산
        int b = 5;
        System.out.println("b:" + b);
        int result2 = b++; // b -> result2 에 대입후, b+1 계산
        System.out.println("b:" + b);
        System.out.println("result2:" + result2);

    }
}
