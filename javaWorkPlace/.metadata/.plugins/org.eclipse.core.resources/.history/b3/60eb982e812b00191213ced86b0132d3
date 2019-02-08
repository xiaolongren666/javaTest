/**
 * 
 */
package xlr.chapter05.section01;

/**
*@Author:小龙人
*@File Name:OverrideDemo.java
*@Created Time:2019年2月8日下午4:52:08
*@Introduce Function:多态
*/

/**
 * 父类
*@Author:小龙人
*@File Name:OverrideDemo.java
*@Created Time:2019年2月8日下午4:53:21
*@Introduce Function:TODO
 */
class Base {
	public void print() {
		System.out.println("父类.....");
	}
}

/**
 * 子类
*@Author:小龙人
*@File Name:OverrideDemo.java
*@Created Time:2019年2月8日下午4:54:54
*@Introduce Function:TODO
 */
class Son extends Base{
	// 重写父类的print（）方法
	@Override
	public void print() {
		System.out.println("子类");
	}
}

/**
 * 子类
*@Author:小龙人
*@File Name:OverrideDemo.java
*@Created Time:2019年2月8日下午4:55:38
*@Introduce Function:TODO
 */
class Son2 extends Base{
	// 重写父类的print（）方法
	@Override
	public void print() {
		System.out.println("子类2");
	}
}


public class OverrideDemo {
	public static void main(String[] args) {
		Base obj = new Base();
		obj.print();
		
		obj = new Son();
		obj.print();
		
		obj = new Son2();
		obj.print();
	}
}
