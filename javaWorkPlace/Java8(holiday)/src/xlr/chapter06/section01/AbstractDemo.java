/**
 * 
 */
package xlr.chapter06.section01;

/**
*@Author:小龙人
*@File Name:AbstractDemo.java
*@Created Time:2019年2月9日下午2:58:03
*@Introduce Function:TODO
*/
public class AbstractDemo {
	public static void main(String[] args) {
		AbstractAnimal animal;
		animal = new Horse("马儿");
		animal.action();
		animal.call();
		
		animal = new Bird("鸟儿");
		animal.action();
		animal.call();
	}
	
}
