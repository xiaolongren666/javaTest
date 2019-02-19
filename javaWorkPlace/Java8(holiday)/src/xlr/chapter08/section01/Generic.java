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
public class Generic<T> {
	private T data;

	public Generic(T data) {
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
		Generic<String> g = new Generic<String>("hello");
		g.showDataType();
		
		Generic<Integer> g1 = new Generic<Integer>(10);
		g1.showDataType();
		
		Generic<Double> g2 = new Generic<Double>(10.2);
		g2.showDataType();
				
	}
}
