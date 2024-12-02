package com.kh.conditionEx;
/*
* 자료형 변수명 = 특정값;
*
* switch (변수명) {
* case 조건1: case 조건3: case 조건5:    //자바 14 이후부터 가능
 *       조건1,3,5
 * 의 실행코드
*       break; // 없으면 밑에조건도 실행
* case 조건2:
*       조건2의 실행코드
 *       break;
* default :
*       위 조건1,2 아닐때 실행코드
 *       break;
*
*   }
*
*
* */
/*
 * 자료형 변수명 = 특정값;
 *
 * switch (변수명) {
 * case 조건1:
 *       조건1의 실행코드
 *       break; // 없으면 밑에조건도 실행
 * case 조건2:
 *       조건2의 실행코드
 *       break;
 * default :
 *       위 조건1,2 아닐때 실행코드
 *       break;
 *
 *   }
 *
 *
 * */
/*
 * 자료형 변수명 = 특정값;
 *
 * switch (변수명) {
 * case 조건1:
 *       조건1의 실행코드
 *       break; // 없으면 밑에조건도 실행
 * case 조건2:
 *       조건2의 실행코드
 *       break;
 * default :
 *       위 조건1,2 아닐때 실행코드
 *       break;
 *
 *   }
 *
 *
 * */
public class ConditionSwitchEx {
    public void method1(){
        int a = 10;
        switch(a){
            case 1:
                System.out.println(a+"살");
                break;
                case 2:
                System.out.println(a+"살");
                break;
                case 3:
                System.out.println(a+"살");
                break;
                default:
                System.out.println("일치 나이 없음");
                break;




        }
    }

    public void method2(){
        int month = 10;
        String result;
        switch(month){
            case 12: case 1: case 2:
                result="겨울";
                break;
            case 3: case 4: case 5:
                result="겨울";
                break;
            case 6: case 7: case 8:
                result="겨울";
                break;
            case 9: case 10: case 11:
                result="겨울";
                break;

        }
    }

    public void method3(){
        int month = 10;
        String result;
        switch(month){
            case 12,1,2:
                result="겨울";
                break;
            case 3,4,5:
                result="봄";
                break;
            case 6,7,8:
                result="여름";
                break;
            case 9,10,11:
                result="가을";
                break;

        }
    }
}
