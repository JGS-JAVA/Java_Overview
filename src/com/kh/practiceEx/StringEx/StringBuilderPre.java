package com.kh.practiceEx.StringEx;

public class StringBuilderPre {
    public static void main(String[] args) {
        String str = "Welcome";
        StringBuilder sb = new StringBuilder(str);
        sb.append("to Java");
        sb.insert(8,"the world of");
        sb.replace(4,11,"come to");
        sb.delete(20,25);
        sb.reverse();
        System.out.println(sb);



    }
}
