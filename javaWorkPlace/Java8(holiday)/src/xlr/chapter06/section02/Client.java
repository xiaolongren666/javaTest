/**
 * 
 */
package xlr.chapter06.section02;

/**
*@Author:小龙人
*@File Name:Client.java
*@Created Time:2019年2月9日下午6:24:24
*@Introduce Function:TODO
*/
public class Client {
	public static void main(String[] args) {
		Product product = Factory.getProduct("ProductA");
		System.out.println(product.get());
		
		product = Factory.getProduct("ProductB");
		System.out.println(product.get());
	}
	
}
