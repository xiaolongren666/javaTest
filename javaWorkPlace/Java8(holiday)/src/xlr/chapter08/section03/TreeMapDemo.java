/**
 * 
 */
package xlr.chapter08.section03;

import java.util.TreeMap;

/**
*@Author:小龙人
*@File Name:TreeMapDeno.java
*@Created Time:2019年2月19日下午5:53:12
*@Introduce Function:TreeMap案例
*/
public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String, String> t = new TreeMap<String, String>();
		
		t.put("1", "张三");
		t.put("2", "李四");
		
		System.out.println(t.get("1"));
	}
}
