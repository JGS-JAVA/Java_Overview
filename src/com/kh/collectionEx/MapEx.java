package com.kh.collectionEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Entry<key,value>

* 키-값 쌍으로 데이터 저장구조
* 키는 중복불가(덮어쓰기), 값은 중복허용
* 동일값을 여러개의 다른키에 저장가능
* 키-값 = key-value
* 대표 클래스
* hashmap, 순서 무작위
*  linkedhashmap, 입력순서 유지
*  treemap 키 자연순서나 지정순서로 정렬
*
* 메서드
put (K key, V value): 지정키에 해당값 저장
get (Object key): 지정키에 해당값 반환
remove (Object key): 지정키에 해당값 삭제
containsKey (Object key): 지정키 존재확인
containsValue (Object key): 지정값 존재확인
size() : 맵에 저장된 요소개수 반환
clear() : 모든요소 삭제
keySet() :모든키 set으로 반환
values() : 모든값 collection으로 반환
entrySet() : 모든 엔트리 set으로 반환

map<String,String> 변수명 = new HashMap<String,String>();
HashMap<String,String> 변수명 = new HashMap<String,String>();

HashMap<Integer,String> 변수명 = new HashMap<Integer,String>();
HashMap<String,Integer> 변수명 = new HashMap<String,Integer>();

Entry<key,value>



*
* */
public class MapEx {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);

        map.put("사과", 1000);
        map.put("바나나", 2000);
        map.put("포도", 3000);

        System.out.println(map.get("사과"));

        map.put("사과", 1500);

        System.out.println("물가상승"+map.get("사과"));

        String hasBanana = map.containsKey("바나나")? "yes" : "no";
        System.out.println("바나나 판매?"+hasBanana);

        String has3000Value = map.containsValue("3000")? "yes" : "no";
        System.out.println("3000원짜리 과일 존재?" + has3000Value);

        map.remove("바나나");
        System.out.println("바나나 품절");
        System.out.println("현재 과일개수"+map.size());
        System.out.println("모든키확인"+map.keySet());
        System.out.println("모든값확인"+map.values());
        System.out.println("모든키값확인"+map.entrySet());


        }




    }

