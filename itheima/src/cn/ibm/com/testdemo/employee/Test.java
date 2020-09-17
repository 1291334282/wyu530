package cn.ibm.com.testdemo.employee;

import cn.ibm.com.testdemo.address.Address;

public class Test {
public static void main(String[] args) {
	Address address = new Address("江门","迎宾大道99号");
	Employee employee = new Employee(112233,24,"张三","男",address);
	employee.show();
}
}
