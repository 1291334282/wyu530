package cn.ibm.com.testdemo.employee;

import cn.ibm.com.testdemo.address.Address;

public class Test {
public static void main(String[] args) {
	Address address = new Address("����","ӭ�����99��");
	Employee employee = new Employee(112233,24,"����","��",address);
	employee.show();
}
}
