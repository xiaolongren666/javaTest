/**
 * 
 */
package xlr.chapter03.section03;

/*
*@Author:小龙人
*@File Name:MyClass.java
*@Created Time:下午8:40:14
*@Introduce Function:TODO
*/
public class MyClass {
	int iMyData;

	/** 无参构造方法 */
	public MyClass() {
	}

	/** 有参构造方法 */
	public MyClass(int iMyData) {
		this.iMyData = iMyData;
	}

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		MyClass myClass1 = new MyClass(1);
	}
}
