/**
 * 
 */
package xlr.chapter05.task;

/**
*@Author:小龙人
*@File Name:Task1.java
*@Created Time:2019年2月8日下午9:01:09
*@Introduce Function:TODO
*/

class Person {
	
}

class Teacher extends Person {
	
}

class Student extends Person {
	
}

/**
 * 
*@Author:小龙人
*@File Name:Task1.java
*@Created Time:2019年2月8日下午9:04:10
*@Introduce Function:TODO
 */
public class Task1 {
	public static void main(String[] args) {
		Person teacher = new Teacher();
		Person student = new Student();
		
		System.out.println("教师：" + teacher);
		System.out.println("学生：" + student);
	}
	
}
