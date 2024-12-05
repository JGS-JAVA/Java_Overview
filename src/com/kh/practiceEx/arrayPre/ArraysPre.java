package com.kh.practiceEx.arrayPre;

import java.util.Arrays;

/*
*
*
*
*
*
*
*
* */
public class ArraysPre {

    public void int1DArray(){
        int[] arr1 = {10,300,20,50,7000,9999};
        int[] arr2 = {10,300,20,50,7000,9999};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr1);     //오름차순
        Arrays.fill(arr1, 500);   //모든값 동일값으로 채움
        boolean a = Arrays.equals(arr1, arr2);
        System.out.println(a);

    }

    public void string1DArray(){
        String[] arr1 = {"apple","banana","cherry","date","elderberry",};
        String[] arr2 = {"apple","banana","cherry","date","elderberry",};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr1);     //오름차순
        Arrays.fill(arr1, "mango");   //모든값 동일값으로 채움
        boolean a = Arrays.equals(arr1, arr2);
        System.out.println(a);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }


    public static void main(String[] args) {
        ArraysPre arraysPre = new ArraysPre();
        arraysPre.int1DArray();
        arraysPre.string1DArray();


    }
}
