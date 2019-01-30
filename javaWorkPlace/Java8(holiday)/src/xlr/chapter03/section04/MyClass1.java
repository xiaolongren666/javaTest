/**
 * 
 */
package xlr.chapter03.section04;

/*
*@Author:小龙人
*@File Name:MyClass1.java
*@Created Time:下午9:08:43
*@Introduce Function:TODO
*/
public class MyClass1 {
	/** public */
	public int a;
	/** private */
	private int b;
	/** protected */
	protected int c;
	/** friendly */
	int d;
	
	public void func1() {
		this.b = 0;
		System.out.println("func1");
	}
	private void func2() {
		System.out.println("func2");
	}
	protected void func3() {
		System.out.println("func3");
	}
	void func4() {
		System.out.println("func4");
	}
}
