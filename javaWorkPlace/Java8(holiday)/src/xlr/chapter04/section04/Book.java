/**
 * 
 */
package xlr.chapter04.section04;

/**
*@Author:小龙人
*@File Name:Book.java
*@Created Time:下午12:22:19
*@Introduce Function:TODO
*/
public class Book {
	/** 姓名 */
	private String sName;
	/** 价格 */
	private double dPrice;
	
	/**
	 * 有参构造方法
	 * @param sName
	 * @param dPrice
	 */
	public Book(String sName, double dPrice) {
		super();
		this.sName = sName;
		this.dPrice = dPrice;
	}
	
	
	
	@Override
	public String toString() {
		return "Book [sName=" + sName + ", dPrice=" + dPrice + "]";
	}



	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		Book book = new Book("JAVA教程", 20);
		System.out.println(book);
		System.out.println("这是一个book对象" + book);
		
		String a = book.toString();
		System.out.println("a:" + a);
	}
	
	
	
}
