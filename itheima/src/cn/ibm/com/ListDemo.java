package cn.ibm.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		System.out.println("foreachѭ��:");
		for (Object object : list) {
			System.out.print(object);
		}
		System.out.println();
		System.out.println("�ڶ���foreachѭ��:");
		list.forEach(System.out::print);
		System.out.println();
		System.out.println("forѭ��:");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		Iterator it = list.iterator();
		ListIterator listIterator = list.listIterator();
		System.out.println("������ѭ��:");
		while (it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
		System.out.println("list������ѭ��:");
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next());
		}

	}
}
