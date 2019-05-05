package com.springboot.bean;

public class User {
    public String name;
    public int age;
    public String address;
    public int tel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public User(){
        System.out.println("创建成功！");
    }

    public User(String name, int age, String address, int tel) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.tel = tel;
    }
}
