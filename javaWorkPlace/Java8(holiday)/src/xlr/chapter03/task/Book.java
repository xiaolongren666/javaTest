/**
 * 
 */
package xlr.chapter03.task;

/**
*@Author:小龙人
*@File Name:Book.java
*@Created Time:下午10:20:36
*@Introduce Function:TODO
*/
public class Book {
	/** 名称 */
	private String name;
	/** 页数 */
	private int pages;
	
	/**
	 * 无参构造方法
	 */
	public Book() {
	}
	
	/**
	 * 有参构造函数
	 * @param name
	 * @param pages
	 */
	public Book(String name, int pages) {
		this.name = name;
		this.pages = pages;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}

	/**
	 * 输出对象属性
	 */
	@Override
	public String toString() {
		return "Book [name=" + name + ", pages=" + pages + "]";
	}
	
	
	
}
