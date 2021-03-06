/**
 * 
 */
package xlr.chapter08.section03;

import java.util.ArrayList;
import java.util.Iterator;

/**
*@Author:小龙人
*@File Name:ArrayListDemo.java
*@Created Time:2019年2月18日下午8:08:10
*@Introduce Function: ArrayList例子
*/
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("北京");
		list.add("上海");
		list.add("青岛");
		
		
		
		System.out.println("--------foreach-------");
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("-----------i----------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(0);
		
		System.out.println("---------Iterator--------");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
