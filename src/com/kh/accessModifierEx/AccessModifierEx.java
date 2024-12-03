package com.kh.accessModifierEx;

import com.kh.oopEx.Nation;
import com.kh.oopEx.Student;
/*
* 캡슐화
* 객체 속성(필드,값) 직접접근 제한하려고 필드에 private 작성
* 게터/세터로 간접접근 가능
*
* private String 변수명;
* public void set변수명(String 매개변수명){
* this.변수명 = 매개변수명;
* }
* public String get변수명(){
* return 변수명;
* }
* 접근제한자
* public (외부접근 허용)
* protected (같은 패키지,자식에서 접근허용)
* default (접근제한자 안붙이면~. 같은 패키지에서 접근허용)
* private (외부접근 불가)
*
* 
* */
public class AccessModifierEx {
    public static void main(String[] args) {
        //지역변수로 접근제한자 사용불가. static main 안에 있어서 static 사용불가 -> static 은 바깥에 작성하기
        Nation n = new Nation();

        Student s = new Student();
    }
}
