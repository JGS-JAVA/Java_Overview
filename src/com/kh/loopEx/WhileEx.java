package com.kh.loopEx;

import java.util.Scanner;

/*
* while(true){  }
*
* while 멈추기1
* 리턴
*
* while 멈추기2 - 변수명에 논리값 담고 멈출때 false 로 변경
* boolean is = true;
* while (is) {
* is=false;
* }
*
* while 멈추기3
* 조건 false로 변경
* while (조건){
* 조건 수행 -> false 에서 멈춤
* }
*
* */
public class WhileEx {


    public void method1(int input){
        int sum = 0;


        while(input != -1){
            System.out.print("반복 시작 ");
            if(input != -1) sum += input;
            //input = new Scanner(System.in).nextInt();
            // 무한루프 탈출. 입력값 갱신을 위해 설정하는 input
        }
            System.out.print("합계: "+sum);

    }
}

















