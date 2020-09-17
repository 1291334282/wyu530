package cn.ibm.com.testdemo.add;

public class Add {
public void add2(int ...b) {
	int sum = 0;
	for(int b1 :b) {
		sum+=b1;
	}
	System.out.println(sum);
}
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	new Add().add2(a);
	new Add().add2(1);
	new Add().add2(1,2,3);
	new Add().add2(1,2);
}
}
