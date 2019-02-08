/**
 * 
 */
package xlr.chapter05.section02;

/**
*@Author:小龙人
*@File Name:DependentDemo.java
*@Created Time:2019年2月8日下午6:15:32
*@Introduce Function:依赖
*/

class Car {
	void run(String city) {
		System.out.println("汽车开到" + city);
	}
}

class Person {
	void travel(Car car) {
		car.run("青岛");
	}
}

/**
 * 
*@Author:小龙人
*@File Name:DependentDemo.java
*@Created Time:2019年2月8日下午6:35:26
*@Introduce Function:TODO
 */
public class DependentDemo {
	public static void main(String[] args) {
		Car car = new Car(); 
		Person person = new Person();
		person.travel(car);
	}
}
