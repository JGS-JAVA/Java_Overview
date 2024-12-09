package com.kh.practiceEx.dbPre;

import java.util.Date;

public interface EmployeeService {
    //퇴사일, 퇴사여부는 선택사항으로 빈칸이다
    void addEmployee(Employee employee);
    //부분 매개변수 전달 생성자로 수정내용 db에 전달, 덮어쓰기
    void updateEmployee(String EMP_NAME, String EMAIL,String PHONE,
                        String DEPT_CODE,String JOB_CODE,String SAL_LEVEL,
                        double SALARY, double BONUS, String MANAGER_ID,
                        Date ENT_DATE, String ENT_YN);
    //14개중 4개 컬럼 일치하면 삭제
    void deleteEmployee(String emp_id,String emp_name,
                        String email,char ent_yn );

    //회원정보 조회시 3개 컬럼 모두 일치시 조회가능 -> 본인이 본인정보 수정시
    void viewEmployee(String emp_id,String emp_name,
                      String email);
    //회원정보 조회시 2개 컬럼 모두 일치시 조회가능 -> 정보조회시 동명이인 구분하기 위해 2개 컬럼이다
    void viewEmployee(String emp_name,
                      String email);
    //회원정보 조회시 3개 컬럼중 하나라도 일치시 조회가능 -> 상급자가 사원정보 수정시
    void viewEmployee(String info_emp);

    //사원 로그인시 2개 컬럼 모두 일치시 로그인
    void loginEmployee(String EMP_NAME, String phone);
}
