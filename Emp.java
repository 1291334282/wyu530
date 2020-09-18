package com.itheima;

import java.io.*;
import java.util.Date;
import java.util.Objects;


public class Emp implements Serializable {
    private String name;
    private int age;
    private String gender;
    private int salary;
    private Date hiredate;
    private static final long serialVersionUID = 1L;

    public Emp(String name, int age, String gender, int salary, Date hiredate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.hiredate = hiredate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emp)) return false;
        Emp emp = (Emp) o;
        return getAge() == emp.getAge() &&
                getSalary() == emp.getSalary() &&
                getName().equals(emp.getName()) &&
                getGender().equals(emp.getGender()) &&
                getHiredate().equals(emp.getHiredate());
    }



    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", hiredate=" + hiredate +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\27484\\Desktop\\sss\\SerTest.txt");
        OutputStream out = new FileOutputStream(f);    // 文件输出流
        ObjectOutputStream oos = new ObjectOutputStream(out);          // 为对象输出流实例化
        Emp emp = new Emp("张三", 25, "男", 5000, new Date());
        oos.writeObject(emp);  // 保存对象到文件
        System.out.println(emp);
        oos.close();
    }
}
