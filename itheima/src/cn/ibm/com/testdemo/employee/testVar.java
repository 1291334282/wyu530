package cn.ibm.com.testdemo.employee;

public class testVar {
	static byte a;
	static short b;
	static int c;
	static long d;
	static char e;
	static float f;
	static boolean g;
	static double h;
	static int i[];
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		b=50;
		a=(byte)b;
		System.out.println("short强转为byte后："+a);
		c=70;
		d=c;
		System.out.println("int强转为long后："+d);
	}

}
