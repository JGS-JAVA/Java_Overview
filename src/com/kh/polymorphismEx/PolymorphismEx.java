package com.kh.polymorphismEx;
/*
* 다형성
* 상속관계의 자식객체가 여러모습으로 보임
* 자식 부모 오브젝트 등으로 변하는 것처럼 보임
*
* 오버로딩 = 같은 클래스에서 같은이름 메서드 여러번 작성
*            조건: 메서드명 동일, 매개변수 개수, 타입, 순서 하나라도 달라야함
*            목적: 전달받은 매개변수에 따른 상황별 처리방법 구현
* sum(a,b) -> 합
* sum(a,b,c) -> 합
* sum(배열) -> 합

* */
//public class PolymorphismEx {
//    public void sum(int a, int b) {
//        System.out.println(a + b);
//    }
//    public void sum(int a, int b, int c) {
//        System.out.println(a + b + c);
//    }
//    public void sum(double a, double b) {
//        System.out.println(a + b);
//    }
//    public void sum(String a, String b) {
//        System.out.println(a + b);
//    }
//
//아래 기준 메소드를 먼저 써놓고
//1번부터 7번까지의 메소드를 차례로 써나간다고 할 때
//오버로딩이 적용되는 것은 무엇일까?
//기준    public void method1(int i){}
//=========================
// 1    public void method1(String str){} 적용가능(기준과 자료형 달라서)

// 2    public void method1(int i, String str){} 적용가능(기준과 갯수, 자료형 달라서)

// 3    public void method1(int num){} 적용불가(기준과 자료형과 갯수 동일해서)

// 4    public char method1(int point){} 적용불가(기준과 자료형과 갯수 동일해서)

// 5    public void method1(int i, int k){} 적용가능(기준과 갯수 달라서)

// 6    public void method1(int num, String string){} 적용불가(2번과 자료형과 갯수, 순서 동일해서)

// 7    public void method1(String str, int i){} 적용가능(기준과 자료형,갯수 달라서)(2,6번과 순서 달라서)
