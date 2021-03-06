/**
 * 
 */
package xlr.chapter06.section02;

/**
*@Author:小龙人
*@File Name:InterfaceDemo.java
*@Created Time:2019年2月9日下午4:38:03
*@Introduce Function:TODO
*/
public class InterfaceDemo implements MyInterface {

	/**
	 *  定义一个字符串数组，长度是接口中定义的常量MAX_SIZE
	 */
	private String[] msgs = new String[MyInterface.MAX_VALUE];
	/**
	 *  记录消息个数
	 */
	private int num = 0;
	
	@Override
	public void delMsg() {
		if (num <= 0) {
			System.out.println("消息队列已空，删除失败！");
		} else {
			msgs[--num] = null;
		}
	}

	@Override
	public void addMsg(String msg) {
		if (num >= MyInterface.MAX_VALUE) {
			System.out.println("消息队列已满，添加失败！");
		} else {
			msgs[num++] = msg;
		}
	}
	
	/**
	 *  定义一个实现类自己的方法
	 */
	public void showMsg() {
		for (String msg : msgs) {
			System.out.println(msg);
		}
	}
	
	public static void main(String[] args) {
		MyInterface myInterface = new InterfaceDemo();
		myInterface.print("张三", "张三", "张三");
		System.out.println(MyInterface.staticTest());
		
		System.out.println("--------------");
		
		
		// 实例化接口实现类
		InterfaceDemo interfaceDemo = new InterfaceDemo();
		interfaceDemo.addMsg("java8应用开发");
		interfaceDemo.addMsg("java8应用开发");
		interfaceDemo.addMsg("java8应用开发");
		interfaceDemo.addMsg("java8应用开发");
		interfaceDemo.addMsg("java8应用开发");
		
		// 输出信息
		interfaceDemo.showMsg();
		
		System.out.println("-------------");
		
		
	}

}
