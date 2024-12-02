package com.kh.practice.todolist;

import java.io.*;
import java.util.Scanner;

public class ToDoList {
    private static String PATH = System.getProperty("user.home") + "/Desktop/";
    private static String FILE_NAME = "todolist"; // 기본 파일 이름
    private static String EXT_NAME = ".txt"; // 기본 확장자명

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("==== To-Do 리스트 관리 ====");
        System.out.println("1. 기존 파일 불러오기");
        System.out.println("2. 새로운 파일로 시작하기");
        System.out.print("옵션을 선택하세요: ");
        String firstChoice = sc.nextLine();


        switch (firstChoice) {
            case "1":
                System.out.print("불러올 To-Do 리스트 파일 이름을 입력하세요(확장자 제외): ");
                FILE_NAME = sc.nextLine() + EXT_NAME;
                break;
            case "2":
                System.out.print("새로운 To-Do 리스트 이름을 입력하세요(확장자 제외): ");
                FILE_NAME = sc.nextLine() + EXT_NAME;
                System.out.println("새로운 파일이 생성됩니다: " + FILE_NAME + EXT_NAME);
                break;
            default:
                System.out.println("잘못된 선택입니다. 기본 파일로 시작합니다: " + FILE_NAME + EXT_NAME);
        }


        boolean isTrue = true;
        while (isTrue) {
            System.out.println("\n==== To-Do 리스트 ====");
            System.out.println("1. 할 일 목록 보기");
            System.out.println("2. 할 일 추가");
            System.out.println("3. 종료");
            System.out.print("옵션을 선택하세요: ");
            String choice = sc.nextLine();


            switch (choice) {
                case "1":
                    try {
                        FileReader file = new FileReader(PATH + FILE_NAME + EXT_NAME);
                        BufferedReader br = new BufferedReader(file);
                        String line;

                        while ((line = br.readLine()) != null) {
                            System.out.println(line);
                        }
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case "2":
                    File file = new File(PATH + FILE_NAME + EXT_NAME);
                    if (!file.exists()) {
                        System.out.println("피일 없음");
                        System.out.println(FILE_NAME + "피일 생성? Yes/No");
                        String answer = sc.nextLine();
                        if (answer.equalsIgnoreCase("yes")) {
                            try {
                                file.createNewFile();
                                System.out.println("파일생성 성공");
                            } catch (IOException e) {
                                System.out.println("피일 생성 실패" + e.getMessage());

                            }
                        } else if (answer.equalsIgnoreCase("no")) {
                            return;
                        } else {
                            System.out.println("종료");
                            return;
                        }

                        try (FileWriter fw = new FileWriter(file, true)) {
                            while (true) {
                                System.out.println("종료시 exit 작성");
                                System.out.println("작성할 내용: ");

                                String input = sc.nextLine();
                                if (input.equalsIgnoreCase("exit")) {
                                    return;
                                } else {
                                    fw.write(input + "\r\n");
                                    System.out.println("내용이 추가되었습니다.");
                                }


                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                    }
                    case "3":
                        System.out.println("종료");
                        return;
            }
        }
    }
}
