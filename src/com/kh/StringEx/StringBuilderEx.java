package com.kh.StringEx;

public class StringBuilderEx {
    public static void main(String[] args) {

        StringBuilderEx sb = new StringBuilderEx();
        sb.method1();
    }

    public void method1(){
        StringBuilder s1 = new StringBuilder();
        s1.append("hello");
        s1.append("world"); //이어쓰기
        System.out.println(s1);
    }
}
