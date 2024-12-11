package com.kh.testEx.test4pre;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentSet {
    public static void main(String[] args) {
        Set<String> studentSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("학생 관리 프로그램");
            System.out.println("1. 학생 추가");
            System.out.println("2. 학생 삭제");
            System.out.println("3. 학생 목록 출력");
            System.out.println("4. 특정 학생 존재 여부 확인");
            System.out.println("5. 종료");
            System.out.print("메뉴 선택: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {

                case 1:
                    System.out.print("학생 추가");
                    System.out.print("이름: ");
                    String nameToAdd = sc.nextLine();
                    if (Student)


                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;

            }
        }

    }
}
