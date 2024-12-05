package com.kh.practiceEx.arrayPre;

import java.util.Arrays;

/*
* sort(변수명) 오름차순 정렬
* fill(변수명,숫자) 모든값 동일값으로 채움
* copyOf(변수명,숫자) 배열복사, 지정길이로 크기변경
* equals(비교1변수명, 비교2변수명) 두 배열 같은지 비교
* deepEquals(2차원이상 배열 비교1변수명,2차원이상 배열 비교2변수명,) 2차
* 
* */
public class ArraysEx {

    public void arr1DMethod(){
        int[] arr1 = {5,2,8,3,1};
        int[] arr2 = {5,2,8,3,1};
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);     //오름차순
        System.out.println(Arrays.toString(arr1));

        Arrays.fill(arr1, 7);   //모든값 동일값으로 채움
        System.out.println(Arrays.toString(arr1));

        boolean a = Arrays.equals(arr1, arr2);
        System.out.println(a);

    }

    public static void main(String[] args) {

        ArraysEx arraysEx = new ArraysEx();
        arraysEx.arr1DMethod();
    }
}
