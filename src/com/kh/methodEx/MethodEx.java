package com.kh.methodEx;
/*
* 접근제한자 static 전달유무 기능명(매개변수명){
* 특정기능이나 반환값 작성
* }
* 
* 대표 메서드
* 생성자(기본-/매개변수-) 게터/세터 투스트링 메인 보이드 리턴
* 전달(반환)할 게 없을때 = 보이드
* public void 메서드명(매개변수명){
* 실행 출력문 코드
* if(기능 문제시){
* 에러 출력문 코드
* return; //종료
* }
* }
* 전달(반환)할 때 = return
* public 자료형 메서드명(매개변수명){
*   return 자료형에 맞는 값; // 리턴 필수
* }
*
* 필드
*
*
* */
public class MethodEx {
    //필드
    private String name;
    
    //게터나 세터 등 클래스 속성,기능 사용
    public MethodEx() {
    }
    //매개변수 생성자 이용해 정보저장
    public MethodEx(String name) {
        this.name = name;
    }
    //필드명의 정보반환
    public String getName() {
        return name;
    }
    //필드명에 정보저장
    public void setName(String name) {
        this.name = name;
    }
    //투스트링은 필드 정보 반환
    @Override
    public String toString() {
        return "MethodEx{" +
                "name='" + name + '\'' +
                '}';
    }

    //메인은 최종적 기능수행 메서드
    public static void main(String[] args) {
        MethodEx methodEx = new MethodEx();
        System.out.println(methodEx);
    }
}
