package com.kh.methodEx;
/*
* 가비지 컬렉션 = 자바 메모리관리 시스템
* 메모리 자동관리
* 사용안하는 객체 자동제거
*
* 자바가 특정기능과 기준으로 메모리 정리
* 메모리정리 직접적으로 설정가능
* System.gc(); // 메모리 정리 실행 요청
*
* 가비지 = 불필요한 데이터, 사용안하는 메모리
*
* trash 일상생활 쓰레기(종이 플라스틱)
* garbage 주방 쓰레기
* rubbish 일반 쓰레기 (모든 종류)
* litter 길거리 공원 쓰레기
* waste 산업 폐기물 환경 쓰레기
* 
*
*
* */
public class GarbageCollection {
    public static void main(String[] args) {
        String 주소 = "https://";
        System.out.println(주소);
        주소 += "www.naver.com";
        System.out.println(주소);

        //스트링은 불변성 때문에 적절한 예시는 아니다

    }
}
