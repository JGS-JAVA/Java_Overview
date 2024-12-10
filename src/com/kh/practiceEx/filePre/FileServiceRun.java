package com.kh.practiceEx.filePre;

public class FileServiceRun {
    public static void main(String[] args) {
        FileService fileService = new FileService();

        String content = "맛있는 목록: \n피자   \n치킨";
        fileService.createFile(content);

    }
}
