package cn.ibm.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class CopyFile {
	static void copy(String srcPathStr, String desPathStr) {
		// ��ȡԴ�ļ�������
		String newFileName = srcPathStr.substring(srcPathStr.lastIndexOf("\\") + 1); // Ŀ���ļ���ַ
		System.out.println("Դ�ļ�:" + newFileName);
		desPathStr = desPathStr + File.separator + newFileName; // Դ�ļ���ַ
		System.out.println("Ŀ���ļ���ַ:" + desPathStr);
		try {
			FileInputStream fis = new FileInputStream(srcPathStr);// ��������������
			FileOutputStream fos = new FileOutputStream(desPathStr); // �������������
			byte datas[] = new byte[1024 * 8];// �������˹���
			int len = 0;// ��������
			while ((len = fis.read(datas)) != -1)// ѭ����ȡ����
			{
				fos.write(datas, 0, len);
			}
			fis.close();// �ͷ���Դ
			fis.close();// �ͷ���Դ
			File oldName = new File("C:\\jmpx\\copy\\myfile.txt");
			File newName = new File("C:\\jmpx\\myfile_cp2.txt");
			oldName.renameTo(newName);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String srcPathStr = "C:\\jmpx\\copy\\myfile.txt"; // Դ�ļ���ַ
		String desPathStr = "C:\\jmpx"; // Ŀ���ļ���ַ
		copy(srcPathStr, desPathStr);
	}
}