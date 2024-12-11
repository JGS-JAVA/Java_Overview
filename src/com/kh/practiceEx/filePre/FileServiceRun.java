package com.kh.practiceEx.filePre;

public class FileServiceRun {
    public static void main(String[] args) {
        FileService fileService = new FileService();

        String content = "맛있는 목록: \n피자   \n치킨";
        fileService.createFile(content);

        fileService.readFile();

        String content2 = "\n볶음밥    \n햄버거   ";
        fileService.appendToFile(content2);

        fileService.readFile();
    }
}
