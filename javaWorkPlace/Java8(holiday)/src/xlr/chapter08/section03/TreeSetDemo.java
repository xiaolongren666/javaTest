/**
 * 
 */
package xlr.chapter08.section03;

import java.util.TreeSet;

/**
*@Author:小龙人
*@File Name:TreeSetDemo.java
*@Created Time:2019年2月18日下午8:34:19
*@Introduce Function:TreeSet案例
*/
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		t.add("第1");
		t.add("第1");
		t.add("第2");
		t.add("第3");
		t.add("第4");
		t.add("第5");
		
		for (String string : t) {
			System.out.println(string);
		}
	}
}
