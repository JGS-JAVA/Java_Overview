package com.kh.collectionEx;

import java.util.ArrayList;
import java.util.List;

/*
* 순차적으로 요소저장 자료구조
* 인터페이스로 정의
* 초기에 Vector 사용시 메모리소모,시간소모 많아 불편함
* 대표 클래스: ArrayList(조회빠름) , LinkedList(삽입,삭제 빠름)
* 순서존재=저장값 0번부터 저장
* 동일값 중복허용
* 동적크기 = 배열과 달리 유동적
* 빈값 허용 = null 값 저장가능
* 
* 주요 메서드(기능)
* add(E e): 리스트 끝에 값 추가
* get(int index): 주어진 정수값 반환
* remove(int index): 주어진 값 삭제
* remove(E e): 주어진 값 삭제
* size() : 리스트 개수 반환
* clear() : 리스트 모든 값 삭제
*
* 사용법
* 리스트 계열인 어레이리스트나 링크드리스트 사용가능
* List<> 변수이름 = new ArrayList<>()
* List<> 변수이름 = new LinkedList<>()
*
* 리스트 중 어레이리스트 사용
* ArrayList<> 변수이름 = new ArrayList<>()
*
* 리스트 중 링크드리스트 사용
* LinkedList<> 변수이름 = new LinkedList<>()
*
* String만 저장
* ArrayList<String> 변수이름 = new ArrayList<>()
*
* Integer만 저장
* List<Integer> 변수이름 = new ArrayList<>()
*
* */
public class ListEx {
    public static void main(String[] args) {
        //두 리스트는 메모리량,실행시간 차이없음
        /*
        * 메모리차이는 어레이리스트 객체선언부가 아니라
        * 객체로 삽입 삭제 연산시 차이남
        * 
        * 
        * */
        //리스트중 어레이리스트 사용하겠다
        List<String> list1 = new ArrayList<String>();
        //어레이리스트 사용하겠다
        ArrayList<String> list2 = new ArrayList<String>();
        //리스트로 만든건 없어서 에러발생
        // List<String> list1 = new List<String>(); 불가


    }
}

























