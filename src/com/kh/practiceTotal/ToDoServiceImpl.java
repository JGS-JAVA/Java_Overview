package com.kh.practiceTotal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToDoServiceImpl implements ToDoService{
    @Override
    public Map<String, String> todoListFullView() {


        return Map.of();
    }

    @Override
    public int todoAdd(String title, String detail) {
        int startId = 1;
        Map<String,String> todoList = new HashMap<>();
        todoList.put("카페가기","코딩하기");
        //todoList.put("수면","수면7시간 이상");
        return startId++;
    }

    @Override
    public boolean todoUpdate(int index, String title, String detail) {
        Map<String,String> taskDetails = new HashMap<>();
        taskDetails.get(index);

        //수정하기
        taskDetails.put("title", "제목수정");
        taskDetails.put("detail", "상세수정");
        return false;
    }
}
