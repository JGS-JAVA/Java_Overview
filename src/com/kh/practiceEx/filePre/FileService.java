package com.kh.practiceEx.filePre;

import java.io.*;

public class FileService {
    public void createFile(String content) {
        //경로 가져오기
        String path = System.getProperty("user.home") + "/Desktop/";
        String filename = "food.docs";
        //파일경로와 파일 가져오기
        File file = new File(path + filename);

        //try (  ) 안에 작성지 자동으로 닫힌다
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(content);
            System.out.println("파일 생성,내용 작성 완료");
            System.out.println(content);
        } catch (Exception e) {
            System.out.println("오류발생" + e.getMessage());

        }
    }

    public void readFile() {
        String path = System.getProperty("user.home") + "/Desktop/";
        String filename = "food.docs";
        File file = new File(path + filename);

        if (file.exists()) {
            try (FileReader fr = new FileReader(file);

                 BufferedReader br = new BufferedReader(fr)) {
                System.out.println(file);
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (Exception e) {
                System.out.println("읽기중 오류발생" + e.getMessage());

            }
        } else {
            System.out.println("파일 없음");
        }

    }

    public void appendToFile(String content) {
        //System.getProperty("user.home") = c/users/user1
        String path = System.getProperty("user.home") + "/Desktop/";
        String filename = "food.docs";
        File file = new File(path + filename);

        if (file.exists()) {
            try(FileWriter fw = new FileWriter(file,true);) {
                fw.write(content);
                System.out.println("이어쓰기 완료");

            } catch (Exception e) {
                System.out.println("작성중 오류발생" + e.getMessage());

            }

        } else {
            System.out.println("파일 없음");

        }

    }
}
