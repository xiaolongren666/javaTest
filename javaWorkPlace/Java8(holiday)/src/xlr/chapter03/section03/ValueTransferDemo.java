/**
 * 
 */
package xlr.chapter03.section03;

/*
*@Author:小龙人
*@File Name:ValueTransferDemo.java
*@Created Time:下午8:10:05
*@Introduce Function:值传递
*/
public class ValueTransferDemo {
	/** 交换两个数 */
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("方法内a:" + a + ",b:" + b);
	}
	
	/** */
	public static void swapObj(MyData data) {
		int temp = data.a;
		data.a = data.b;
		data.b = temp;
	}
	
	public static void main(String[] args) {
		/** 值传递 */
		int a = 6;
		int b = 9;
		System.out.println("调用前a:" + a + ",b:" + b);
		swap(a, b);
		System.out.println("调用后a:" + a + ",b:" + b);
		
		/** 引用(对象)传递 */
		MyData data = new MyData();
		data.a = 6;
		data.b = 9;
		System.out.println("调用前data.a:" + data.a + ",data.b:" + data.b);
		swapObj(data);
		System.out.println("调用后data.a:" + data.a + ",data.b:" + data.b);
		
	}
}
