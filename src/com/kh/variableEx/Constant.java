package com.kh.variableEx;
/*
* 상수 키워드
* final
* 상수명은 대문자 작성, 연결은 _ 로 한다
*
*
* */
public class Constant {
        public static final int NUMBER = 100;
        //스태틱 상수 = 글로벌 상수
    public static void main(String[] args) { //메인에선 접근제어자 생략
        //지역변수-이미 선언된 메서드 내부로 접근제한.
        //지역변수는 public void method, public 자료형 method 에서 사용불가
        //점근제한자 사용불가
        Variable variable = new Variable();
        final double PI = 3.14;
        final int MAX = 100;

        // 상수는 어디서든 쓰도록 static 붙이기
    }
}
