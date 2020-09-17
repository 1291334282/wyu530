package cn.ibm.com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReadWriteTest {
	public static void main(String[] args) throws IOException {
		CharRead();
		CharWriter();
	}

	private static void CharWriter() throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\jmpx\\copy\\456.txt");
		Writer out = new FileWriter(f);
		String str = "Hello ×Ö·ûÁ÷";
		out.write(str);
		out.close();
		System.out.println("write³É¹¦");
	}

	private static void CharRead() throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\jmpx\\copy\\123.txt");
		Reader inReader = new FileReader(file);
		char[] c = new char[1024];
		int temp = 0, len = 0;
		while ((temp = inReader.read()) != -1) {
			c[len] = (char) temp;
			len++;
		}
		inReader.close();
		System.out.println(new String(c, 0, len));

	}
}
