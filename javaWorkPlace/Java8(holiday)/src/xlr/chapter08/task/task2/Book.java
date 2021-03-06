/**
 * 
 */
package xlr.chapter08.task.task2;

/**
*@Author:小龙人
*@File Name:Book.java
*@Created Time:2019年2月19日下午7:39:56
*@Introduce Function:TODO
*/
public class Book implements Comparable<Book>{
	/** 书名 */
	private String name;
	/** 价格 */
	private int price;
	
	/** 构造方法 */
	public Book() {
		
	}
	
	/**
	 * @param name
	 * @param price
	 */
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	/** 重写toString()方法 */
	public String toString() {
		return "书名:" + name + ",价格:" + price;
	}
	

	/** 重写ComparableTo方法 */
	@Override
	public int compareTo(Book book) {
		if(this.price < book.price) {
			return -1;
		} else if(this.price == book.price) {
			return 0;
		} else {
			return 1;
		}
	}
	
	
}
