package com.fei.entity;

/**
 * @author feixiaoteng
 * @create 2019-07-06 19:21
 */
public class Users {
    private Integer id;
    private String name;
    private String password;
    private String sex;
    private Integer age;

    public Users() {
    }

    public Users(Integer id, String name, String password, String sex, Integer age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
