/**
 * 
 */
package xlr.chapter03.section02;

/*
*@Author:小龙人
*@File Name:Person.java
*@Created Time:下午7:55:42
*@Introduce Function:Person类
*/
public class Person {
	/** 姓名 */
	private String cName;
	/** 年龄 */
	private int iAge;
	/** 地址 */
	private  String cAddress;
	
	/** 无参构造函数 */
	public Person() {
	}
	
	/** 有参构造函数 */
	public Person(String cName, int iAge, String cAddress) {
		this.cName = cName;
		this.iAge = iAge;
		this.cAddress = cAddress;
	}
	
	/** 输出信息 */
	public void display() {
		System.out.println("姓名:" + cName + ",年龄:" + iAge + ",地址" + cAddress);
	}
	
	/** setter/getter方法 */
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getiAge() {
		return iAge;
	}
	public void setiAge(int iAge) {
		this.iAge = iAge;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
}
