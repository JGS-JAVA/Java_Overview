package com.kh.conditionEx;

public class ConditionPre {
    public void method1(int month){
        String result;

        if (3<=month && month<=5) result ="봄";
        else if (6<=month && month<=8) result ="여름";
        else if (9<=month && month<=11) result ="가을";
        else result ="겨울";

        System.out.println(month + "월의 계절은 " +result+"입니다");
    }
}
