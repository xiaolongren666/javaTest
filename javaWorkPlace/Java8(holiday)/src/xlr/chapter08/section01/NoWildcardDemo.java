/**
 * 
 */
package xlr.chapter08.section01;

/**
*@Author:小龙人
*@File Name:NoWildcardDemo.java
*@Created Time:2019年2月18日下午4:56:16
*@Introduce Function:泛型通配符？的引入
*/
public class NoWildcardDemo {
	
	public static void myMethod(Generic<?> g) {
		g.showDataType();
	}
	
	public static void main(String[] args) {
		Generic<Object> g = new Generic<Object>("hello");
		NoWildcardDemo.myMethod(g);
		
		Generic<Integer> g1 = new Generic<Integer>(10);
		NoWildcardDemo.myMethod(g1);
		
		Generic<Double> g2 = new Generic<Double>(10.2);
		NoWildcardDemo.myMethod(g2);
	}
}
