package com.kh.testEx.test1pre;

public class Member {
    // - : private / + : public
    private String id;
    private String name;
    private String password;

    public Member() {
    }

    public Member(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login(String inputId, String inputPassword) {

        return this.id.equals(inputId) && this.password.equals(inputPassword);
    }
}
