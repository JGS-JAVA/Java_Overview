package com.kh.practiceEx.arrayPre;
/*
*
*
*
*
* */
public class ArrayPre {

    public void maxValue() {
        int[] numbers = {12, 45, 3, 22, 78, 10};
        int max = numbers[0];
        /*
         * int max = numbers[0]; 0번째에 최대값 저장할 자리로 설정해서
         * for (int i = 1 부터 시작한다
         * 비교 반복해서 0번째에 큰수 대입
         *
         *
         * */
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        } //for 문 나와서 출력문
        System.out.println(max);
    }

    public void findString() {
        String[] strings = {"apple", "cherry", "banana", "jkl", "mno"};
        String target = "cherry";

        for (int i = 0; i < strings.length; i++) {
            if (strings.equals(target)) {
                System.out.println(target + i);
            }
        }
    }

    public void replaceArrayNumber() {
        int[] numbers = {10, 20, 30, 20, 40, 20, 320};
        int target = 20;
        int replacenumber = 99;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                numbers[i] = replacenumber;
            }
        }
        System.out.println(numbers);
    }

    public void replaceArrayString() {
        String words[] = {"apple", "banana", "cherry", "banana", "date"};
        String target = "banana";
        String replaceword = "mango";
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                words[i] = replaceword;
            }
        }
        System.out.println(words);
    }

    public void print2DArray() {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
        }
        System.out.println();
    }

    public void find2DArray() {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 5;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == target) {
                    System.out.println(numbers[i][j] + "은 [" + i + "][" + j + "] 위치에 존재합니다.");
                }
            }
        }

    }

    public void findStringIn2DArray() {
        String[][] words = {{"cat", "dog", "fish",}, {"parrot", "hamster", "rabbit",}, {"turtle", "snake", "lizard",}};
        String target = "rabbit";
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                if (words[i][j].equals(target)) {

                }
            }
            System.out.println(words[i]);
        }
    }

    public void replaceStringIn2DArray() {
        String[][] words = {{"red", "blue", "green",}, {"yellow", "blue", "purple",}, {"pink", "blue", "orange",}};
        String target = "blue";
        String replaceword = "cyan";
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                if (words[i][j].equals(target)) {
                    words[i][j] = replaceword;
                }
            }
            System.out.println(words[i]);
        }
    }

    public static void main(String[] args) {
        ArrayPre arrayPre = new ArrayPre();
//        arrayPre.maxValue();
//        arrayPre.findString();
//        arrayPre.replaceArrayString();
//        arrayPre.print2DArray();
//        arrayPre.find2DArray();
//        arrayPre.findStringIn2DArray();
        arrayPre.replaceStringIn2DArray();
    }
}
//드래그 + shift + 따옴표 = 따옴표로 감싸기
//드래그 + shift + 괄호 = 괄호로 감싸기

//자바 Arrays 파일의 기능 사용
//Arrays.toString(words) 1차원배열로만 출력(1차원 배열요소를 문자열로 변환 출력, 2차원 이상은 주소값만 출력)
//Arrays.deepToString(words) 다차원배열 출력(2차원 이상 모든요소 내부배열까지 탐색해서 출력)
