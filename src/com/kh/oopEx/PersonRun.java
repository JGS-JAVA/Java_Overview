package com.kh.oopEx;

import java.io.*;

public class PersonRun {
    public static void main(String[] args) {
        Person person = new Person("홍길동",40);

        //
        String path = System.getProperty("user.home") + "/Desktop/person.txt";
        // 직렬화
        try (FileOutputStream fos = new FileOutputStream(path);){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            System.out.println("직렬화 완료"+person);
            System.out.println("저장완료"+path);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //역직렬화
        try (FileInputStream fis = new FileInputStream(path);){
            ObjectInputStream ois = new ObjectInput(fis);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
