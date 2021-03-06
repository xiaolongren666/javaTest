/**
 * 
 */
package xlr.chapter05.task;

/**
*@Author:小龙人
*@File Name:Test.java
*@Created Time:2019年2月9日下午2:24:54
*@Introduce Function:多态练习
*/
public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		show(new Cat());
		show(new Dog());
		
		AbstractAnimal a = new Cat();
		a.eat();
		Cat c = (Cat)a;
		c.work();
	}
	
	public static void show(AbstractAnimal a) {
		a.eat();
		// 类型判断
		if (a instanceof Cat) {
			Cat c = (Cat)a;
			c.work();
		} else if (a instanceof Dog) {
			Dog c = (Dog)a;
			c.work();
		}
	}
}

/**
 * 
*@Author:小龙人
*@File Name:Test.java
*@Created Time:2019年2月9日下午2:39:39
*@Introduce Function:TODO
 */
abstract class AbstractAnimal {
	/**
	 * 吃
	 */
	abstract void eat();
}

class Cat extends AbstractAnimal {
	@Override
	public void eat() {
		System.out.println("吃鱼");
	}
	public void work() {
		System.out.println("抓老鼠");
	}
}

class Dog extends AbstractAnimal {
	@Override
	public void eat() {
		System.out.println("吃骨头");
	}
	public void work() {
		System.out.println("看家");
	}
}
