/**
 * 
 */
package xlr.chapter08.task.task2;

import java.util.ArrayList;
import java.util.Collections;

/**
*@Author:小龙人
*@File Name:Task2.java
*@Created Time:2019年2月19日下午7:38:49
*@Introduce Function:创建一个泛型集合存放图书，对图书进行排序并输出
*/
public class Task2 {
	public static void main(String[] args) {
		ArrayList<Book> libary = new ArrayList<Book>();
		
		libary.add(new Book("小龙人", 20));
		libary.add(new Book("小龙人", 100));
		libary.add(new Book("小龙人", 23));
		
		Collections.sort(libary);
		
		for (Book book : libary) {
			System.out.println(book.toString());
		}
		
	}
}
