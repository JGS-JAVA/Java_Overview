package com.kh.practiceEx.dbPre;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {

    // String = 사원id 가져오는 문자열     Employee = id에 해당하는 사원정보
    public Map<String, Employee> employeeMap = new HashMap<String, Employee>();
    @Override
    public void addEmployee(Employee employee) {
        //사원등록시 몇번째인지 count 진행, 정보저장
    employeeMap.put(employee.getEMP_ID(), employee);
    }

    @Override
    public void updateEmployee(String EMP_NAME, String EMAIL, String PHONE,
                               String DEPT_CODE, String JOB_CODE, String SAL_LEVEL,
                               double SALARY, double BONUS, String MANAGER_ID, Date ENT_DATE, String ENT_YN) {
    System.out.println(EMP_NAME);
    }

    @Override
    public void deleteEmployee(String emp_id, String emp_name, String email, char ent_yn) {

    Employee employee = employeeMap.get(emp_id);  // db에서 id 가져오기
    if (employee != null) {
        employeeMap.remove(emp_id);
        System.out.println("삭제 완료");
    }else{
        System.out.println("employee not found");
    }
    }

    @Override
    public void viewEmployee(String emp_id, String emp_name, String email) {
    Employee employee = employeeMap.get(emp_id);
    if (employee != null) {
        System.out.println(employee);
    } else{
        System.out.println("employee not found");
    }
    }

    @Override
    public void viewEmployee(String info_emp) {
        Employee employee = employeeMap.get(info_emp);
        if (employee != null) {
            System.out.println(employee);
        } else{
            System.out.println("employee not found");
        }
    }

    @Override
    public void viewEmployee(String emp_name, String email) {
        Employee employee = employeeMap.get(emp_name);
        if (employee != null) {
            System.out.println(employee.toString());
        } else{
            System.out.println("employee not found");
        }

    }

    @Override
    public void loginEmployee(String EMP_NAME, String phone) {


    }
}
