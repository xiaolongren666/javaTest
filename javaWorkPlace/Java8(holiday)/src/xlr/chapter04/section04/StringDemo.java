/**
 * 
 */
package xlr.chapter04.section04;

/**
*@Author:小龙人
*@File Name:StringDemo.java
*@Created Time:下午6:04:11
*@Introduce Function:
*/
public class StringDemo {
	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
//		String str = "world";
//		System.out.println(str);
//		
//		String str1 = str + 10 + 20;
//		System.out.println("str1:" + str1);
//		
//		System.out.println("拼接后：" + 10 + 20 + str);
//		
//		String str2 = 10 + 20 + str;
//		System.out.println(str2);
		
		String a = "HEllo";
		String str = "i am tom, welcom!";
		System.out.println("str1:" + str.length());
		
		System.out.println("a的长度:" + a.length());

		System.out.println("a.subString(3):" + str.substring(3));
		System.out.println("a.subString(3, 6):" + str.substring(3, 6));
		System.out.println("a.toLowerCase():" + a.toLowerCase());
		System.out.println("a.toUpperCase():" + a.toUpperCase());
	} 
}
