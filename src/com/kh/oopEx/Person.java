package com.kh.oopEx;

import java.io.Serializable;
//직렬화에 필요한 Serializable 객체 불러오기
public class Person implements Serializable {
    private static final long serialVersionUID = 1L; //직렬화 ID
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
