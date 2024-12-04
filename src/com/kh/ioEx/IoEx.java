package com.kh.ioEx;
/*
* IO = Input Output 약자
* Stream = 데이터 한방향으로 흐르게한다
* buffer 로 모은 데이터 처리/출력
*
* buffer = 입출력 성능향상 위해 일시저장 메모리공간
* 버퍼링 = 데이터 모으기
* file IO = 파일 읽고 쓰기
* standard IO 표중 입출력 = 콘솔,키보드로 데이터 입출력
* System.in/out
*
*
* 입력,출력과정
* 파일 네트워크 메모리 등 여러 소스에서 데이터 읽고쓰기
*
* 입력
* 데이터 소스 읽기
* 파일, 키보드입력, 네트워크 연결 등
*
* 출력
* 데이터를 다른곳으로 보내기
* 콘솔출력, 파일쓰기, 네트워크로 데이터전송
* 
* 폴더 대표적 패키지
* 1.java.io 패키지
* 전통적 입출력 방식으로 스트림 사용해 데이터처리
* input/outputStream : 바이트 단위 데이터처리
* reader/writer : 문자 단위 데이터처리
* file : 파일 및 디렉토리 다루는 클래스
* bufferedreader/writer : 한줄씩 입출력
*
*
* 2.java.nio 패키지
* New IO 더 효율적 비동기적 데이터처리
* path/files : 파일 및 디렉토리 작업
* bytebuffer : 바이트 데이터 저장 및 읽기
* channels : 비동기 데이터 전송하는 채널
*
* 특성                 IO                  NIO
* 데이터 단위        스트림기반               버퍼기반
* 작업방식           동기적                   비동기적
* 처리속도           느림                      빠름
* 유연성             단순                      복잡
*
* 동기(Synchronous) 같을 동 / 기약할 기 -> 같은사람,작업이 시작과 끝을 기약한다
* 작업요청후 결과반환까지 기다림
* 요청작업 완료해야 다음작업 시작
* 단순, 시간오래걸림, 작겁 순차적 실행
* 호출한 쪽은 결과 기다림
*
* 비동기(Asynchronous) -> 여러사람이 서로 동시에 다른 얘기하며 대화가 겹치는 상황
* 서로 독립적으로 실행
* 작업완료시 알림으로 결과전달
* 알림은 콜백, 이벤트
* 호출한 쪽은 결과 기다리자 않고 병렬처리
*
*
*
* */
public class IoEx {
}