package com.kh.testEx.test1pre;

import java.util.Scanner;

public class MemberRun {
    public static void main(String[] args) {

        Member m = new Member();
        m.setName("강길자");
        m.setId("user1");
        m.setPassword("pass1");

        if(m.login("user1", "pass1")) {
            System.out.println("로그인성공"+m.getName()+"님 환영");
        } else {
            System.out.println("로그인실패");

        }
    }
}
