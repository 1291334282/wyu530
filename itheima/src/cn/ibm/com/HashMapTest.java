package cn.ibm.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("aa", "Kevin1");
		map.put("bb", "Kevin2");
		map.put("dd", "Kevin3");
		map.put("aa", "Kevin");
		System.out.println(map);
		Set<Map.Entry<String, String>> set = map.entrySet();
		for (Map.Entry<String, String> entry : set) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}

	}
}
