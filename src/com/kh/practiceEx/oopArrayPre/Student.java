package com.kh.practiceEx.oopArrayPre;

public class Student {
    //메서드 밖에 쓴 전역변수
    private String name;
    private int age;
    private String idCard;

    public Student() {
    }

    //필수로 저장할 변수명 작성
    public Student(String name, int age /*String idCard*/) {
        this.name = name;
        this.age = age;
        //this.idCard = idCard;  -> 선택사항
    }

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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idCard='" + idCard + '\'' +
                '}';
    }

    /*
    * 회원가입 필수작성값은 파라미터생성자로 DB 에 저장
    * 로그인, 회원가입 선택사항, 비밀번호 암호화처리는 세터로 저장
    * 세터 자장시 기본생성자 이용해 객체 생성후 저장
    * */
    //db에 값 저장시 파라미터생성재로 한번에 저장하거나 세터로 하나씩 값 체크후 저장한다
    //세터 = 
    //게터 = db에 저장된 값을 프론트에 전달 반환

}
