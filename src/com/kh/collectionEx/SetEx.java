package com.kh.collectionEx;

import java.util.HashSet;
import java.util.Set;

/*
* 중복불가 컬렉션
* 순서 무작위 , 중복제거나 고유값 관리시 사용
* null 저장 1개 허용 (중복불가)
*
* 대표 클래스
* hashset 빠른 검색,삽입
*  linkedhashset 순서유지로 느림
*  treeset
*
* 메서드
* add(E e) : 값 추가/ 이미 존재한값 추가시 덮어쓰기/false       // Element 의 E
* remove(Object o) : 제거
* contains(Object o) : 존재확인
* size() : 개수 반환
* clear() : 모든 값 제거
*
* 사용법
* Set<> 변수명 = new HashSet<>();
* HashSet<> 변수명 = new HashSet<>();
* 나머지는 리스트와 동일
* */
public class SetEx {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        HashSet<String> s2 = new HashSet<>();


    }
}
