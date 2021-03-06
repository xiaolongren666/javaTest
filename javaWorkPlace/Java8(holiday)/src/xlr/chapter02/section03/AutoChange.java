/**
 * 
 */
package xlr.chapter02.section03;

/*
*@Author:小龙人
*@File Name:AutoChange.java
*@Created Time:下午8:57:21
*@Introduce Function:类型转换
*/
public class AutoChange {
	public static void main(String[] args) {
		
		byte b = 7;
		// 字节型自动转化为短整型
		@SuppressWarnings("unused")
		short b1 = b;
		System.out.println(b);
		
		char c = 'A';
		// 字符型自动转换为整形
		int c1 = c;
		System.out.println("A的整形数字:"+c1);
		
		// 32位整形自动转换为64位长整形
		long c2 = c1;
		
		// 32位整形自动转换为64位双精度
		@SuppressWarnings("unused")
		double c3 = c1;
		
		
		/**
		 * 强制转换
		 */
		// 64位长整形强制转换为32为整形
		@SuppressWarnings("unused")
		int c4 = (int)c2;
		
		// float为32位，不加f后缀默认为double类型，为64位
		float f = 3.14f;
		// 32位float强制转换为32位整形
		@SuppressWarnings("unused")
		int i2 = (int)f; 
		// 32位float类型强制转换为64位long类型
		long f2 = (long)f;
		
		// 精度丢失
		System.out.println(f);
		System.out.println(f2);
		
		
	}
}
