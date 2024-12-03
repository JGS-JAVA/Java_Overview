package com.kh.arrayEx;
/*
* 배열(자료구조)
* 자바의 배열
* 같은 자료형 변수를 묶어서 다룸
* 생성 배열요소는 인덱스로 구분 (요소=값)
* 생성배열 활용은 배열 참조하는 참조형변수 이용
* 참조형변수=주소저장변수
* 변수사용시 저장주소 찾아 그곳의 배열,객체 참조
*
* 기본자료형 8개 이외 나머지 모두 참조형 변수
* 기본=byte short int long boolean float double char
*
* 배열길이 확인 length 로 갯수 확인
*
*
*
* */
public class ArrayEx {

    public void method1(){
        int num; //stack 영역에 정수 자료형 저장공간 생성, 그 변수이름을 num이라 함
        int[] arr; //stack 영역에 정수배열 자료형 저장공간 생성
        arr = new int[4]; //heap 영역에 정수 4개짜리 배열 할당후 배열주소를 arr변수에 대입
        //arr로 배열 참조가능

        System.out.println("초기화 전");

        arr[0]=100;
        arr[1]=1000;
        arr[2]=5;
        arr[3]=888;

        System.out.println("초기화 후");

    }

    public void method2(){
        String str;
        String[] arr = new String[4];
        arr[0]="java";
        arr[1]="html";
        arr[2]="css";
        arr[3]="javaScript";
        //01_배열선언, 초기화전 후 메모리구조_string

        String arr2[]={"java","html","css","javaScript",};
    }

    public void method3() {
        int num[] = {1, 100, 1000};
        System.out.println(num.length); //갯수확인
        /*
         * 2차원 배열
         * int[][] arr = new int[1][2]; 2칸짜리 1차원배열 1개 묶은 배열
         *
         *
         * */
        public void method () {
            int arr[][] = new int[2][3];
            arr[0][0] = 10;
            arr[0][1] = 100;
            arr[0][2] = 1000;
            arr[1][0] = 20;
            arr[1][1] = 20;
            arr[1][2] = 20;

        }
    }
}
