/**
 * 
 */
package xlr.chapter04.section04;

/**
*@Author:小龙人
*@File Name:StringBufferDemo.java
*@Created Time:下午6:50:59
*@Introduce Function:TODO
*/
public class StringBufferDemo {
	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb);
		
		sb.append("java");
		System.out.println(sb);

		sb.insert(0, "hello");
		System.out.println(sb);
		
		String a = new String("hello");
		System.out.println(a);
		
		a = "hello" + a;
		
		sb.replace(5, 6, ",");
		System.out.println("replace:" + sb);
		
		sb.delete(5, 6);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		
	}
}
