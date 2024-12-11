package com.kh.testEx.test3pre;

import java.util.HashMap;
import java.util.Map;

public class StudentScoreManager {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();

        studentScores.put("김철수", 85);
        studentScores.put("이영희", 92);
        studentScores.put("박민수", 77);
        studentScores.put("최수진", 88);

        System.out.println("학생정보");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("합격여부 판단");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            String status = (entry.getValue() >= 80) ? "합격" : "불합격";
            System.out.println(entry.getKey() + " : " + status);
        }

        String updateName = "박민수";
        if (studentScores.containsKey(updateName)) {
            studentScores.put(updateName, 82);
            System.out.println(updateName + "수정완료");

        } else {
            System.out.println("해당학생 없음");


        }
        System.out.println("합격여부 판단");


        }


    }

    public void printPassFailStudentScores(Map<String, Integer> studentScores) {

        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            String status = (entry.getValue() >= 80) ? "합격" : "불합격";
            System.out.println(entry.getKey() + " : " + status);
        }
    }
}
//