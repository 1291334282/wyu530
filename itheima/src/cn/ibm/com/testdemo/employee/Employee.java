package cn.ibm.com.testdemo.employee;

import cn.ibm.com.testdemo.address.Address;

public class Employee {
private int id;
private int age;
private String name;
private String gender;
private Address address;
public void show() {
	System.out.println("id="+id+",age="+age+",name="+name+",gender="+gender+",city="+address.getCity()+",street="+address.getStreet());
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Employee(int id, int age, String name, String gender, Address address) {
	super();
	this.id = id;
	this.age = age;
	this.name = name;
	this.gender = gender;
	this.address = address;
}


}
