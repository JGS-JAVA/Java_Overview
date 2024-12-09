package com.kh.practiceEx.arrayPre;

/*
 * Object Array = 자바에서 객체를 배열로 관리하는 자료구조
 * 같은타입 객체 여러개 저장시 사용
 * 데이터 그룹으로 다루거나 반복문으로 처리
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * */
public class CarArrayPre {
    String brand;
    int year;
    String model;

    public CarArrayPre() {
    }

    public CarArrayPre(String brand,  String model,int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return
                "brand='" + brand +
                        ", year=" + year +
                        ", model='" + model;

    }
}
