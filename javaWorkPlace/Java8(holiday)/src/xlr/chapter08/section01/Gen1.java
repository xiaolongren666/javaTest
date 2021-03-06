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
public class Gen1 {
	private Object data;

	public Gen1(Object data) {
		this.data = data;
	}
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public void showDataType() {
		System.out.println("成员变量的类型为:" + this.data.getClass().getName());
	}
	
	public static void main(String[] args) {
		String a = "hello";
		Gen1 g = new Gen1(a);
		g.showDataType();
		
		// 编写无错误，运行错误
		@SuppressWarnings("unused")
		double d = (double)g.getData();
	}
}
