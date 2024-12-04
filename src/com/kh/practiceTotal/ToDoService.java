package com.kh.practiceTotal;

import java.util.Map;

/*
* 할일목록 반환 서비스
*
*
*
*
*
*
*
* */
public interface ToDoService {

     Map<String,String> todoListFullView();


     int todoAdd(String title,String detail);
     boolean todoUpdate(int index,String title,String detail);

}
