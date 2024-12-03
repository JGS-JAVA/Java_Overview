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
*
* do-while()
* 조건식이 뒤에 작성된 와일문
* 트루가 아니라도 최초 1회이상 반복 보장
*
* do{
* 최초 1회 무조건 수행, 2회부터는 참이어야 수행
* } while(조건);
*
*
* */
public class WhileEx {


    public void method1(int input){
        int sum = 0;


        while(input != -1){
            System.out.print("반복 시작 ");
            if(input != -1) sum += input;
            //LoopRun 에서 Scanner 로 입력받은 값 실행하는 method1 에 들어와서
            // input 값을 다시 새로 작성하는 코드 없어서 무한루프 발생
            // 무한루프 탈출. 입력값 갱신을 위해 설정하는
            // input = input.nextInt()
            input = new Scanner(System.in).nextInt(); // Scanner 변수명 한번에 쓰기
        }
            System.out.print("합계: "+sum);

    }
}

















