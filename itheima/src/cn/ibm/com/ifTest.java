package cn.ibm.com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ifTest {
	public void cals() {
		
	}
	public static void main(String[] args) {
		int a = 1;
		int b=a++;
		System.out.println(a+","+b);
		StringBuilder stringBuilder = new StringBuilder("°Ù¶È£º");
		stringBuilder.append("www.");
		stringBuilder.append("baidu");
		stringBuilder.append(".com");
		System.out.println(stringBuilder);
		Date dNowDate = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(simpleDateFormat.format(dNowDate));
		System.out.println(dNowDate);
		
	}
}
