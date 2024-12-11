package com.kh.StringEx;

public class StringEx {

    public static void main(String[] args) {
        StringEx se = new StringEx();
        se.methodString();
/*
* String 대표기능
* String str = "안녕";
* str.length() = 문자열 길이 반환
* str.charAt(int index) = 특정 인덱스 위치 문자 반환
* str.indexOf(String str) = 특정 문자열의 첫째위치 반환 (못찾으면 -1)
* str.lastIndexOf(String str) = 특정 문자열 마지막위치 반환
* str.contains(String str) = 문자열이 특정값 포함하는지 참/거짓으로 확인
* str.equals(String str) = 문자열이 같은지 비교(대소문자 구분)
* str.equalsIgnoreCase(String str) = 문자열이 같은지 비교(대소문자 구분 X )
* str.toUpperCase() = 문자열 대문자로 변환
* str.toLowerCase() = 문자열 소문자로 변환
* str.trim() = 문자열 앞뒤 공백제거
* str.subString(int beginIndex) = 특정위치부터 끝까지 자르기
* str.subString(int beginIndex, int endIndex) = 특정위치부터 특정위치까지 자르기
* str.replace(target,replacement) = 특정 문자를 다른문자로 교체
* str.replaceAll(String regex, replacement) = 정규식 이용해 치환
* str.split(String regex) = 문자열을 정규식 기준으로 나누기
* str.concat(String str) = 문자열 결합
* str.join(구분자,결합1,결합2,결합3, ...) = 구분자로 문자열 결합
* str.isEmpty() = 문자열 비었나 확인 참/거짓
* str.isBlank() = 문자열 공백이나 비었나 확인 참/거짓
*
*
*
*
*
* */

        public void methodString(){
            String str1 = "Hello World";
            String str2 = "Hello";
            System.out.println(str1.length());
            System.out.println(str2.charAt(1));
            System.out.println(str2.indexOf("l")); //l 첫 위치
            System.out.println(str2.lastIndexOf("l")); //l 끝 위치
            System.out.println(str1.contains("World"));
            System.out.println(str1.equals(str2));
            System.out.println(str1.trim().equalsIgnoreCase("Hello World"));
            System.out.println(str1.toUpperCase());
            System.out.println(str2.toLowerCase());
            System.out.println(str1.trim());

            String str3 = "Hello Java World";
            System.out.println(str3.substring(6));
            System.out.println(str3.substring(3,7));
            System.out.println(str3.replace("Jave","HTML"));

            String str4 = "Let's learn!";
            System.out.println(str3.concat(str4));

            String[] splitArray = str3.split(" ");
            System.out.println("str3를 공백으로 나눈 결과: "+splitArray.length);
            for(String s : splitArray){
                System.out.println(s);
            }



        }

        public void method1() {
            String str = "안녕 반갑";
            System.out.println(str);
            str = "식사 맛있게?";
            System.out.println(str);
        }

        public void method2() {
            String str = "Hello";
            str += "World";
            System.out.println(str);
        }

    }
}
