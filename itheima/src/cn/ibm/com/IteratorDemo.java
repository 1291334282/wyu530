package cn.ibm.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		Collection collection = new ArrayList();
		show(collection);
	}

	private static void show(Collection collection) {
		// TODO Auto-generated method stub
		collection.add("a");
		collection.add("b");
		collection.add("c");
		collection.add("d");
		collection.add("e");
		Iterator iterable = collection.iterator();
		System.out.println("µü´úÆ÷±éÀúÊä³ö£º");
		while (iterable.hasNext()) {
			System.out.print(iterable.next());
		}
	}
}
