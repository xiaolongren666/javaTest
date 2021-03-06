/**
 * 
 */
package xlr.chapter08.section05;

/**
*@Author:小龙人
*@File Name:Person.java
*@Created Time:2019年2月19日下午6:33:25
*@Introduce Function:Person
*/
public class Person implements Comparable<Person> {
	/** 姓名 */
	private String name;
	/** 年龄 */
	private int age;
	/** 地址 */
	private String address;
	
	/** 默认构造方法 */
	public Person() {
	}

	/**
	 * @param name
	 * @param age
	 * @param address
	 */
	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	/** 重写toString()方法 */
	public String toString() {
		return "姓名:" + name + ",年龄:" + age + ",地址:" + address;
	}
	
	
	/** 重写Comparable接口中compareTo()方法 */
	public int compareTo(Person p) {
		if(this.age < p.age) {
			return -1;
		} else if(this.age == p.age) {
			return 0;
		} else {
			return 1;
		}
	}
}
