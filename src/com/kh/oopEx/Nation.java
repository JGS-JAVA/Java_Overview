package com.kh.oopEx;
/*
* 클래스: 객체가 가질 속성(필드=값),기능(메서드)을 코딩한 문서
* 속성 = 전역변수=멤버변수 (앞에 접근제한자 붙일수있다)
*
* 접근제한자(static 없음)   자료형   변수명
*
* 기능 안에 매개변수, 지역변수 앞에 젭근제한자 사용불가
* 기능종류
* 기본생성자 매개변수생성자 게터 세터 보이드메서드 리턴메서드 메인메서드 투스트링
* 단축키 alt + insert
*
*
* */
public class Nation {
    private String name;
    private int age;
    private String gender;

    public Nation() {     //super() 생략됨
    }

    //매개변수 생성자: 필드의 모든 변수명을 매개변수명으로 전달인자를 전달받음
    public Nation(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //보이드메서드(세터), 리턴메서드(게터) -> 값 부분수정, 특정값 전달받을때 세터로 값 저장해서 전달
    //멤버변수에 있는 모든 변수명에 값저장시 매개변수생성자 이용
    //이름과 나이만 저장할때 setName, setAge
    //게터 = 매개변수생성자나 셋변수명으로 저장된 값을 프론트나 다른코드로 자장된값을 전달시 필수로 사용.
    //값 저장시 매개변수생성자 / 세터 둘 중 선택사용



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //투스트링 = 메서드 저장값 무엇인지 확인하는 메서드, 리턴자료형=스트링
    @Override
    public String toString() {
        return
                "name='" + name +
                ", age=" + age +
                ", gender='" + gender  ;

    }
}
