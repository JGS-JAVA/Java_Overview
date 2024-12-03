package com.kh.inheritanceEx;

public class 부모 {
    public String 성씨 = "강";
    private int money = 100_000_000;
    private String car = "제네시스";

    public 부모() {
        //super(); 생략-자바 오브젝트 상속받아서
    }

    public 부모(String 성씨, int money, String car) {
        //super(); 생략-자바 오브젝트 상속받아서
        this.성씨 = 성씨;  //변경불가로 세터 불가, 게터 가능
        this.money = money;
        this.car = car;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    @Override   //부모 메서드를 자식이 재정의해 사용
    public String toString() {
        return
                "부모성씨='" + 성씨  +
                ", money=" + money +
                ", car='" + car;

    }
}
