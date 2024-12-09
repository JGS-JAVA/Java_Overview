package com.kh.practiceEx.oopArrayPre;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {

    public void setSaveAllUser() {
        Scanner sc = new Scanner(System.in);
        User u = new User();
        System.out.println("사용자 등록");
        System.out.println("이름입력(2~5자)");


        //String 변수명 = u.setUsername("홍길동"); 불가
        //set 으로 저장한값은 변수명에 넣지않고 get 으로 반환한다

        String inputName = sc.nextLine();
        if (inputName != null && inputName.length() >= 2) {
            u.setUsername(inputName);
            System.out.println(u.getUsername());
        } else {
            System.out.println("빈칸, 6자이상 불가");
            return;
        }

        System.out.println("나이입력(1 이상 100 미만)");
        int inputAge = sc.nextInt();
        try {
            if (inputAge > 0 && inputAge < 108) {
                u.setAge(inputAge);
                System.out.println(u.getAge());
            } else {
                System.out.println("나이는 1 이상 100 미만");
                return;
            }
        } catch (Exception e) {
            System.out.println("숫자만 입력");
            return;
        }


        System.out.println("email 입력");
        String inputEmail = sc.nextLine();
        if (inputEmail != null && inputEmail.length() >= 2 && inputEmail.length() < 30) {
            u.setEmail(inputEmail);
            System.out.println(u.getEmail());

        } else {
            System.out.println("빈칸,30자이상 불가");
            return;
        }


        ArrayList<User> al = new ArrayList();
        al.add(u);

        System.out.println(al.toString());
    }

    public void paramNameEmail() {
        Scanner sc = new Scanner(System.in);


        System.out.println("이름입력: ");
        String inputName = sc.nextLine();
        if (inputName != null && inputName.length() >= 2) {
            System.out.println(inputName);
        } else {
            System.out.println("입력오류");

        }

        System.out.println("이메일 입력: ");
        String inputEmail = sc.nextLine();
        if (inputEmail != null && inputEmail.length() >= 2) {
            System.out.println(inputEmail);
        } else {
            System.out.println("입력오류");

        }

            System.out.println("나이입력? (YES/NO)");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("yes")) {
            setSaveAllUser();

        } else {
            return;
        }

    }

}
