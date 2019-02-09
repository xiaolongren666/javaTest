/**
 * 
 */
package xlr.chapter06.section02;

/**
*@Author:小龙人
*@File Name:Factory.java
*@Created Time:2019年2月9日下午6:21:28
*@Introduce Function:TODO
*/
public class Factory {
	static final String PRODUCT_A = "ProductA";
	static final String PRODUCT_B = "ProductB";
	public static Product getProduct(String name) {
		Product p = null;
		if (PRODUCT_A.equals(name)) {
			p = new ProductA();
		}
		if (PRODUCT_B.equals(name)) {
			p = new ProductB();
		}
		return p;
	}
}
