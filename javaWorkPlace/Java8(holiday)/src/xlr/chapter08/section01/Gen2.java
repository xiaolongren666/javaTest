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
public class Gen2<T> {
	private T data;

	public Gen2(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public void showDataType() {
		System.out.println("成员变量的类型为:" + this.data.getClass().getName());
	}
	
	public static void main(String[] args) {
		String a = "hello";
		Gen2<String> g = new Gen2<String>(a);
		g.showDataType();
		
		// 编写出现错误
		// double d = (double)g.getData();
		// 泛型不需要自动进行强制转换
		@SuppressWarnings("unused")
		String b = g.getData();
	}
}
