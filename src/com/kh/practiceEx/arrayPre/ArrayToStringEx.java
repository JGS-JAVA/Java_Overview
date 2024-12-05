package com.kh.practiceEx.arrayPre;

import java.util.Arrays;

/*
* 1차원 /다음 차 , 시작 원
*
* 2차원
*
*
*
* */
public class ArrayToStringEx {

    public void toString1DMethod(){
        int[] numbers = {1,2,3,4,5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
     //  deepToString 는 2차원부터 가능


    }

    public void toString2DMethod(){
        int[][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
        //각 행에 값들이 존재해서 행렬의 위치 주소값 출력
        //[ = 1차원 [[ = 2차원 I = Int @ = 주소시작
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(numbers));
//for 문으로 순회출력 안해도 됨
    }

    public void lunchMenuArray(){
        String[] lunchMenu = {"김치찌개","된장찌개","삼겹살","초밥","치킨","햄버거",};
        System.out.println(Arrays.toString(lunchMenu));
    }
    public void lunchMenu2DArray(){
        String[][] lunchMenu = {{"김찌","된찌","불"},{"햄","피","파"},{"짜","짬","탕"},{"초","라","돈"}};
        System.out.println(Arrays.deepToString(lunchMenu));

    }

  public static void main(String[] args) {
      ArrayToStringEx atse = new ArrayToStringEx();
      atse.toString1DMethod();
      atse.lunchMenuArray();
      atse.lunchMenu2DArray();


  }
}
