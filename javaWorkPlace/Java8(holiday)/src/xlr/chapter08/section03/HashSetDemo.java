/**
 * 
 */
package xlr.chapter08.section03;

import java.util.HashSet;
import java.util.Iterator;

/**
*@Author:小龙人
*@File Name:HashSetDemo.java
*@Created Time:2019年2月18日下午8:31:02
*@Introduce Function:HashSet案例
*/
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		
		h.add("第1");
		h.add("第1");
		h.add("第2");
		h.add("第3");
		h.add("第4");
		
		for (String string : h) {
			System.out.println(string);
		}
		
		h.remove("第1");
		System.out.println("-------Iterator---------");
		Iterator<String> it = h.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
