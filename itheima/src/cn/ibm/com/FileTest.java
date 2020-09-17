package cn.ibm.com;

import java.io.File;

public class FileTest {

	public static void chearch(String path) {
		File file = new File(path);
		File[] fileListFiles = file.listFiles();
		System.out.println(file.getAbsolutePath() + "里面的文件:");
		for (File file2 : fileListFiles) {
			if (file2.isFile()) {
				System.out.println("   +" + file2.getName());
			} else {
				System.out.println("   +" + file2.getName() + "文件夹");
				chearch(file2.getAbsolutePath());
			}
		}

	}

	public static void main(String[] args) {
		chearch("C:/jmpx");
		chearch("C:\\QMDownload\\SoftMgr");
	}
}
