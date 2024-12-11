package com.kh.StringEx;
/*
* StringBuilder
* append(String str) = 문자열을 이어쓰기로 추가
* insert(int index, String str) = 지정위치에 문자열 삽입
* delete(int start, int end) = 지정범위 삭제
* deleteCharAt(int index) = 지정위치 문자 삭제
* replace(int start, int end, String str) = 지정범위 교체
* reverse() = 거꾸로 뒤집기
* length() = 길이반환
* charAt(int index) = 문자 반환
* setCharAt(int index, char ch) = 문자 교체
* subString(int start, int end) = 지정범위 반환
* subString(int start) = 지정위치부터 끝가지 반환
* trimToSize() = 내부버커크기를 현재길이로 맞춤
* capacity() = 현재 내부 버퍼크기 반환
* sureCapacity(int minimumSize) = 내부 버퍼 용량을 최소지정용량으로 늘리기
*
*
*
*
*
*
*
*
*
* */
public class StringBuilderEx {
    public static void main(String[] args) {

        StringBuilderEx sb = new StringBuilderEx();
       // sb.method1();
    }

    public void methodStringBuilder(){

        StringBuilder sb1 = new StringBuilder(); // 메모리 확보
        StringBuilder sb2 = new StringBuilder("Hello"); // 메모리 확보 후 Hello 저장
        sb2.append("World");
        System.out.println(sb2);
        sb2.insert(5, " Java ");
        System.out.println(sb2);
        sb2.replace(6,10, "Python");
        System.out.println(sb2);
        sb2.delete(6,13);
        System.out.println(sb2);
        sb2.reverse();
        System.out.println(sb2);



    }

    public void method1(){
        StringBuilder s1 = new StringBuilder();
        s1.append("hello");
        s1.append("world"); //이어쓰기
        System.out.println(s1);
    }
}
