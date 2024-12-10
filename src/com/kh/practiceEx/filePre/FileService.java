package com.kh.practiceEx.filePre;

import java.io.File;
import java.io.FileWriter;

public class FileService {
    public void createFile(String content) {
        //경로 가져오기
        String path = System.getProperty("user.home") + "/Desktop/";
        String filename = "food.docs";
        //파일경로와 파일 가져오기
        File file = new File(path + filename);

        //try (  ) 안에 작성지 자동으로 닫힌다
        try(FileWriter fw = new FileWriter(file)) {
            fw.write(content);
            System.out.println("파일 생성,내용 작성 완료");
            System.out.println(content);
        } catch (Exception e){
            System.out.println("오류발생" + e.getMessage());

        }
    }
}
