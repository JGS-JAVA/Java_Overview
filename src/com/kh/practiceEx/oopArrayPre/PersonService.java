package com.kh.practiceEx.oopArrayPre;

import java.util.Scanner;

public class PersonService {

    public static void main(String[] args) {
        Person[] people = new Person[4];
        Scanner sc = new Scanner(System.in);




//        people[0] = new Person("홍길동",20);
//        people[1] = new Person("박길동",30);
//        people[2] = new Person("오길동",40);
//        people[3] = new Person("강길동",50);

        //일반 for
        for (int i = 0; i < people.length; i++) {
           System.out.print(i+"번째 사람 이름: ");
           String name = sc.nextLine();

           System.out.print(i+"번째 사람 이름: ");
            int age = sc.nextInt();
            sc.nextLine();
            people[i] = new Person(name, age);
        }
            System.out.println("모든사람 등록완료" + people);

        //향상된 for-each
//        for(Person person : people) {
//            System.out.println(person);
//        }

    }
}
