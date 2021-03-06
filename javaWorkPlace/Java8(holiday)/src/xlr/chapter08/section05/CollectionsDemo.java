/**
 * 
 */
package xlr.chapter08.section05;

import java.util.ArrayList;
import java.util.Collections;

/**
*@Author:小龙人
*@File Name:CollectionsDemo.java
*@Created Time:2019年2月19日下午6:42:32
*@Introduce Function:Collections工具类的使用
*/
public class CollectionsDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Person("李四", 8, "上海"));
		list.add(new Person("王五", 50, "济南"));
		list.add(new Person("马六", 46, "烟台"));
		list.add(new Person("赵克令", 35, "青岛"));
		
		System.out.println("-----排序前----");
		for (Person person : list) {
			System.out.println(person);
		}
		
		Collections.sort(list);
		System.out.println("---------排序后-----");
		for (Person person : list) {
			System.out.println(person);
		}
		
		System.out.println("MAX：" + Collections.max(list));
		System.out.println("MIN：" + Collections.min(list));
	}
}
