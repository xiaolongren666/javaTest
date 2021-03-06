/**
 * 
 */
package xlr.chapter04.section03;

/**
*@Author:小龙人
*@File Name:Person.java
*@Created Time:下午12:14:20
*@Introduce Function:Person类
*/
public class Person {
	/** 姓名 */
	private String sName;
	/** 年龄 */
	private int age;
	
	/**
	 * 有参构造方法
	 * @param sName
	 * @param age
	 */
	public Person(String sName, int age) {
		super();
		this.sName = sName;
		this.age = age;
	}
	
	/**
	 * 
	 * @param p
	 * @return
	 */
	public boolean equals(Person p) {
		if(this.age == p.age) {
			return true;
		} else {
			return false;
		} 
	}
}
