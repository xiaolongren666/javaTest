/**
 * 
 */
package xlr.chapter05.section04;

/**
*@Author:小龙人
*@File Name:Singleton.java
*@Created Time:2019年2月8日下午8:46:49
*@Introduce Function:单例模式
*/
class Singleton {
	private static Singleton instance = null;
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		// 第一次使用j时生成实例，提高效率
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

/**
 * 
*@Author:小龙人
*@File Name:SingletonDemo.java
*@Created Time:2019年2月8日下午8:56:37
*@Introduce Function:TODO
 */
public class SingletonDemo {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		if (singleton1 == singleton2) {
			System.out.println("s1和s2是同一个对象！");
		}
	}
}
