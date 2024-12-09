package com.kh.practiceEx.oopArrayPre;

import java.util.ArrayList;

public class StudentService {
    public static void main(String[] args) {


/*
* 학생2, 3
* 학생2 는 if문으로 프론트엔드에서 받은 값 검증후 선택적 저장
* 학생3 은 프론트엔드에서 검증한 값 저장후 추가적으로 검증할 값은 검증후 저장
*
* */
        Student[] students = new Student[2];
        students[0] = new Student();
        students[1] = new Student("홍길동",10);
        Student student2 = new Student();
        String inputName = "김철수";
        if(inputName != null && inputName.length() <= 6) {
            student2.setName(inputName);
            System.out.println(inputName);
        }else {
            System.out.println("이름은 6자 이하,공백불가"+inputName+"저장불가");

        }
        int inputAge = 18;
        if(inputAge != 0 /*&& inputAge.length <= 100*/) {
            student2.setAge(inputAge);
            System.out.println(inputAge);
        }else {
            System.out.println("나이 12 이상 19 이하, 어린이나 성인 불가");

        }
        String inputIdCard = "버스카드";
        if(inputIdCard != null && inputIdCard.length() <= 10) {
            student2.setIdCard(inputIdCard);
            System.out.println(inputIdCard);
        }else {
            System.out.println("10자 이하 기능만 추가기입 가능");

        }

        Student student3 = new Student("강길동",15);
        System.out.println("버스카드기능 추가(선택사항/1만원)");
        String plusIdCard = "버스카드";
        if(plusIdCard != null && plusIdCard.length() <= 10) {
            student3.setIdCard(plusIdCard);

        }else {
        System.out.println("버스카드기능 없이 학생증 발급");

        }

        ArrayList<Student> studentsList = new ArrayList<>();

        studentsList.add(students[0]);
        studentsList.add(students[1]);
        studentsList.add(student2);
        studentsList.add(student3);


            System.out.println("학생증 발급완료");
        for(int i=0; i<studentsList.size(); i++) {
            System.out.println(studentsList.get(i));
        }
    }
}
