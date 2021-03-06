/**
 * 
 */
package xlr.chapter08.section03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
*@Author:小龙人
*@File Name:HashMapDemo.java
*@Created Time:2019年2月19日下午5:48:31
*@Introduce Function:HashMap案例
*/
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>(16);
		
		hm.put("a", "zhangsan");
		hm.put("b", "lisi");
		hm.put("c", "wangwu");
		hm.put(null, null);
		
		hm.remove("a");
		
	/*	System.out.println(hm.get("a"));
		System.out.println(hm.get("b"));
		System.out.println(hm.get("c"));
		System.out.println(hm.get(null));*/
		
		// MAP转换为Collection
		Set<Entry<String, String>> entrySet = hm.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println("-----Map中的键");
		Set<String> keySet = hm.keySet();
		for (String string : keySet) {
			System.out.println(string);
		}
		
		Collection<String> values = hm.values();
		System.out.println("------------------Map中的值");
		for (String string : values) {
			System.out.println(string);
		}
	}
}
