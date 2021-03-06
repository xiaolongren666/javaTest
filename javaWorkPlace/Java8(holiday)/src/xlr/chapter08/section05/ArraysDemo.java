/**
 * 
 */
package xlr.chapter08.section05;

import java.util.Arrays;

/**
*@Author:小龙人
*@File Name:ArraysDemo.java
*@Created Time:2019年2月19日下午7:01:11
*@Introduce Function:Arrays工具类
*/
public class ArraysDemo {
	public static void main(String[] args) {
		Person[] p = new Person[5];
		
		p[0] = new Person("张三", 13, "北京");
		p[1] = new Person("李四", 8, "上海");
		p[2] = new Person("王五", 50, "济南");
		p[3] = new Person("马六", 46, "烟台");
		p[4] = new Person("召柯灵", 35, "青岛");
		
		for (Person person : p) {
			System.out.println(person);
		}
		System.out.println("-----------");
		Arrays.sort(p);
		System.out.println("排序后");
		for (Person person : p) {
			System.out.println(person);
		}
		
		System.out.println("--------------");
		System.out.println(Arrays.toString(p));
		
		System.out.println("------------------");
		Person[] copy = Arrays.copyOfRange(p, 1, 4);
		System.out.println("拷贝后:");
		for (Person person : copy) {
			System.out.println(person);
		}
		
	}
}
