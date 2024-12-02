package com.kh.conditionEx;

/*
조건에 맞는 구문이 1개이면 중괄호 생략가능
if (조건) 조건 참일때 실행코드

if (조건1) 조건1 참일때 실행코드 
else if (조건2) 조건1 거짓이고 조건2 참일때 실행코드
else 조건1,2 거짓일때 실행코드

 * */
public class ConditionIfEx {
    public void method1(int age) { //매개변수명age 에 전달인자로 나이 들어옴
        if (age >= 19) {
            System.out.println("성인");
        } else if (age <= 18 && age >= 14) {
            System.out.println("청소년");
        } else {
            System.out.println("어린이");

        }
    }

    public void method0(int age) {
        // if 문만 중괄호 생략한 경우
        if (age >= 19) System.out.println("성인"); //중괄호 생략가능

        // if, else if, else 문 중괄호 생략한 경우
        if (age >= 19) System.out.println("성인");
        else if (age <= 18 && age >= 14) System.out.println("청소년");
        else System.out.println("어린이");

        // if, else if, else 문 중괄호 생략후 결과 result 로 전달
        String result;

        if (age >= 19) result = "성인";
        else if (age <= 18 && age >= 14) result = "청소년";
        else result = "어린이";
        System.out.println(age+"에 따른 결과:"+result);
    }
}

