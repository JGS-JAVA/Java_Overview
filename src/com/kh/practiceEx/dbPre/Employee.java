package com.kh.practiceEx.dbPre;

import java.util.Date;

// 추후 db 컬럼명과 연결할 자바 변수명으로 db 와 자바변수명 일치시키기
public class Employee {
    //    EMP_ID	VARCHAR2(3 BYTE)
    private String EMP_ID;
    //    EMP_NAME	VARCHAR2(20 BYTE)
    private String EMP_NAME;
    //    EMP_NO	CHAR(14 BYTE) -> 한글자씩 14자 허용
    private String EMP_NO;
    //    EMAIL	VARCHAR2(25 BYTE)
    private String EMAIL;
    //    PHONE	VARCHAR2(12 BYTE)
    private String PHONE;
    //    DEPT_CODE	CHAR(2 BYTE)
    private String DEPT_CODE;
    //    JOB_CODE	CHAR(2 BYTE)
    private String JOB_CODE;
    //    SAL_LEVEL	CHAR(2 BYTE)
    private String SAL_LEVEL;
    //    SALARY	NUMBER (정수 실수 구분없음)
    private double SALARY;
    //    BONUS	NUMBER
    private double BONUS;
    //    MANAGER_ID	VARCHAR2(3 BYTE)
    private String MANAGER_ID;
    //    HIRE_DATE	DATE
    private Date HIRE_DATE;
    //    ENT_DATE	DATE
    private Date ENT_DATE;
    //    ENT_YN	CHAR(1 BYTE)
    private String ENT_YN;

    public Employee() {
    }

    public Employee(String EMP_ID, String EMP_NAME,
                    String EMP_NO, String EMAIL, String PHONE,
                    String DEPT_CODE, String JOB_CODE, String SAL_LEVEL,
                    double SALARY, double BONUS, String MANAGER_ID, Date HIRE_DATE,
                    Date ENT_DATE, String ENT_YN) {
        this.EMP_ID = EMP_ID;
        this.EMP_NAME = EMP_NAME;
        this.EMP_NO = EMP_NO;
        this.EMAIL = EMAIL;
        this.PHONE = PHONE;
        this.DEPT_CODE = DEPT_CODE;
        this.JOB_CODE = JOB_CODE;
        this.SAL_LEVEL = SAL_LEVEL;
        this.SALARY = SALARY;
        this.BONUS = BONUS;
        this.MANAGER_ID = MANAGER_ID;
        this.HIRE_DATE = HIRE_DATE;
        this.ENT_DATE = ENT_DATE;
        this.ENT_YN = ENT_YN;
    }

    public String getEMP_ID() {
        return EMP_ID;
    }

    public void setEMP_ID(String EMP_ID) {
        this.EMP_ID = EMP_ID;
    }

    public String getEMP_NAME() {
        return EMP_NAME;
    }

    public void setEMP_NAME(String EMP_NAME) {
        this.EMP_NAME = EMP_NAME;
    }

    public String getEMP_NO() {
        return EMP_NO;
    }

    public void setEMP_NO(String EMP_NO) {
        this.EMP_NO = EMP_NO;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getDEPT_CODE() {
        return DEPT_CODE;
    }

    public void setDEPT_CODE(String DEPT_CODE) {
        this.DEPT_CODE = DEPT_CODE;
    }

    public String getJOB_CODE() {
        return JOB_CODE;
    }

    public void setJOB_CODE(String JOB_CODE) {
        this.JOB_CODE = JOB_CODE;
    }

    public String getSAL_LEVEL() {
        return SAL_LEVEL;
    }

    public void setSAL_LEVEL(String SAL_LEVEL) {
        this.SAL_LEVEL = SAL_LEVEL;
    }

    public double getSALARY() {
        return SALARY;
    }

    public void setSALARY(double SALARY) {
        this.SALARY = SALARY;
    }

    public double getBONUS() {
        return BONUS;
    }

    public void setBONUS(double BONUS) {
        this.BONUS = BONUS;
    }

    public String getMANAGER_ID() {
        return MANAGER_ID;
    }

    public void setMANAGER_ID(String MANAGER_ID) {
        this.MANAGER_ID = MANAGER_ID;
    }

    public Date getHIRE_DATE() {
        return HIRE_DATE;
    }

    public void setHIRE_DATE(Date HIRE_DATE) {
        this.HIRE_DATE = HIRE_DATE;
    }

    public Date getENT_DATE() {
        return ENT_DATE;
    }

    public void setENT_DATE(Date ENT_DATE) {
        this.ENT_DATE = ENT_DATE;
    }

    public String getENT_YN() {
        return ENT_YN;
    }

    public void setENT_YN(String ENT_YN) {
        this.ENT_YN = ENT_YN;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EMP_ID='" + EMP_ID + '\'' +
                ", EMP_NAME='" + EMP_NAME + '\'' +
                ", EMP_NO='" + EMP_NO + '\'' +
                ", EMAIL='" + EMAIL + '\'' +
                ", PHONE='" + PHONE + '\'' +
                ", DEPT_CODE='" + DEPT_CODE + '\'' +
                ", JOB_CODE='" + JOB_CODE + '\'' +
                ", SAL_LEVEL='" + SAL_LEVEL + '\'' +
                ", SALARY=" + SALARY +
                ", BONUS=" + BONUS +
                ", MANAGER_ID='" + MANAGER_ID + '\'' +
                ", HIRE_DATE=" + HIRE_DATE +
                ", ENT_DATE=" + ENT_DATE +
                ", ENT_YN='" + ENT_YN + '\'' +
                '}';
    }
}
