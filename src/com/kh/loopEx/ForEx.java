package com.kh.loopEx;
/*

for 문은 ; ; 존재가 중요해서 ;; 있으면 실행됨
* for(초기값;조건문;증감식){
* 조건 참일때 실행코드
* }
*
* for(초기값;true;증감식){ -> 무한루프
 * 조건 참일때 실행코드
 * }
*
* for(; ; ){ -> 무한루프
* 조건 참일때 실행코드
* }
*
* for(int a=1;  ; i++){ -> 무한루프
* 조건 참일때 실행코드
* }

for 문 조건 참일때 실행기능 1개면 중괄호 생략가능
for(초기값;조건문;증감식) 조건 참일때 실행코드
*
* */
public class ForEx {
    public void method1(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }

    //중괄호 생략가능
    public void method2(){
        for(int i=1;i<=10;i++)System.out.println("i:"+i);
    }
}
