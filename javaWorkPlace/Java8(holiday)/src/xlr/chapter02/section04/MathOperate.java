/**
 * 
 */
package xlr.chapter02.section04;

/*
*@Author:小龙人
*@File Name:MathOperate.java
*@Created Time:下午9:16:14
*@Introduce Function:TODO
*/
public class MathOperate {
	public static void main(String[] args) {
		// 算术运算符
		int a = 5;
		int b = 3;
		int c = a + b;
		System.out.println("a+b的值:"+c);
		
		c = a * b;
		System.out.println("a*b的值:"+c );
		
		c = a % b;
		System.out.println("a%b的值:"+c );
		
		// 字符串拼接
		String aa = "abc";
		String bb = "efg";
		System.out.println(aa + bb);
	}
}
