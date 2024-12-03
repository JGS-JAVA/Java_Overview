package com.kh.inheritanceEx;
/*
*
*
*
*
* */
public class 자식 extends 부모 {
    //필드
    private String computer;

    public 자식() {
        super();

    }

    public 자식(String 성씨, int money, String car, String computer) {
        super(성씨, money, car);
        this.computer = computer;
    }

    @Override
    public String toString() {
        return super.toString()+  "computer='" + computer ;

    }
}
