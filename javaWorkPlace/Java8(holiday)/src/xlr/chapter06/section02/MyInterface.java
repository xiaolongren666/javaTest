/**
 * 
 */
package xlr.chapter06.section02;

/**
*@Author:小龙人
*@File Name:MyInterface.java
*@Created Time:2019年2月9日下午4:31:11
*@Introduce Function:TODO
*/
public interface MyInterface {
	/**
	 *  接口里定义的成员变量只能是常量
	 */
	int MAX_VALUE = 50;
	
	/**
	 *  接口里定义的普通方法只能是public的抽象方法
	 */
	void delMsg();
	
	/**
	 * 添加信息
	 * @param msg
	 */
	void addMsg(String msg);
	
	/**
	 *  接口定义默认方法，需要使用default修饰
	 * @param msgs
	 */
	default void print(String...msgs) {
		for (String msg : msgs) {
			System.out.println(msg);
		}
	}
	
	/**
	 *  接口中定义类方法，需要使用static修饰
	 * @return
	 */
	static String staticTest() {
		return "接口里的类方法";
	}
	
}
