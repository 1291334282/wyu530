package cn.ibm.com;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<Birthday> hashSet = new LinkedHashSet<Birthday>();
		hashSet.add(new Birthday(1, 4, 6));
		hashSet.add(new Birthday(6, 3, 7));
		System.out.println(hashSet);

	}
}
