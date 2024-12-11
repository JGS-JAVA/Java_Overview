package com.kh.StringEx;

public class StringBufferEx {
    public void method1(){
        StringBuffer sb = new StringBuffer();
        sb.append("Hello World");
        sb.append("!"); //이어쓰기
    }
}
//String 이어쓰기는 += 사용
//StringBuilder 이어쓰기는 append 사용