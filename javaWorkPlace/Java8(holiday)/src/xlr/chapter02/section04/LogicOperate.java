/**
 * 
 */
package xlr.chapter02.section04;

/*
*@Author:小龙人
*@File Name:LogicOperate.java
*@Created Time:下午9:04:26
*@Introduce Function:逻辑运算
*/
public class LogicOperate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = true;
		
		// 与（&&）运算
		boolean result = a && b;
		System.out.println("a && b=" + result);
		
		//或（||）运算
		result = a || c;
		System.out.println("a || c=" + result);
		
		// 非（！）运算
		result = !a;
		System.out.println("!a=" + result);
			
	}

}
