/**
 * 
 */
package xlr.chapter05.section01;

/**
*@Author:小龙人
*@File Name:ClassExtendsDemo.java
*@Created Time:下午9:34:20
*@Introduce Function:TODO
*/
public class ClassExtendsDemo {
	public static void main(String[] args) {
		Mobile mobile = new Mobile("iPhone 6", "苹果", 5288, "4.7英寸", "双核");
		mobile.display();
		
		System.out.println("--------------");
		
		Printer printer = new Printer("喷墨打印机", "惠普", 600, "6色真彩", "A4纸");
		printer.display();
	}
}
