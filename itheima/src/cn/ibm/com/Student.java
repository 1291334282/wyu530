package cn.ibm.com;

public class Student extends Person{
private String schoolString;

public String getSchoolString() {
	return schoolString;
}

public void setSchoolString(String schoolString) {
	this.schoolString = schoolString;
}

@Override
public String toString() {
	return "Student [schoolString=" + schoolString + ", getAge()=" + getAge() + ", getName()=" + getName() + "]";
}





}
