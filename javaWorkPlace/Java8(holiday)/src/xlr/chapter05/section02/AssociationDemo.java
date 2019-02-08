/**
 * 
 */
package xlr.chapter05.section02;

/**
*@Author:小龙人
*@File Name:AssociationDemo.java
*@Created Time:2019年2月8日下午6:37:15
*@Introduce Function:关联关系
*/

class Car1 {
	void run(String city) {
		System.out.println("汽车开到" + city);
	}
}

class Person1 {
	Car1 car;
	
	Person1(Car1 car) {
		this.car = car;
	}
	
	void travel() {
		car.run("青岛");
	}
}

public class AssociationDemo {
	public static void main(String[] args) {
		Car1 car1 = new Car1();
		Person1 person1 = new Person1(car1);
		person1.travel();
	}
}
