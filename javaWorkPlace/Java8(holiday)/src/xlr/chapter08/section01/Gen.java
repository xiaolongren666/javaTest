/**
 * 
 */
package xlr.chapter08.section01;

/**
*@Author:小龙人
*@File Name:Gen.java
*@Created Time:2019年2月18日下午4:33:32
*@Introduce Function:泛型引入案例
*/
public class Gen {
	private String data;

	public Gen(String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public void showDataType() {
		System.out.println("成员变量的类型为:" + this.data.getClass().getName());
	}
	
	public static void main(String[] args) {
		String a = "hello";
		Gen g = new Gen(a);
		g.showDataType();
	}
}
