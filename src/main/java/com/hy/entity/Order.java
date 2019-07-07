package com.hy.entity;

/*

  植树造法 

*/
public class Order {
    private int sid;
    private String name;
    private int age;
    private String sex;

    public Order() {
    }

    public Order(int sid, String name, int age, String sex) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Order{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
