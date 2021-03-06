/**
 * 
 */
package xlr.chapter05.task;

import java.util.ArrayList;

/**
*@Author:小龙人
*@File Name:Box.java
*@Created Time:2019年2月8日下午10:12:58
*@Introduce Function:TODO
*/
public class Box{
	ArrayList<Fruit> fruits = new ArrayList<Fruit>();
	
	public void addFruit(Fruit fruit) {
		fruits.add(fruit);
	}
	
	public void getFruit(Fruit fruit) {
		fruits.remove(fruit);
	}
	
	public void display() {
		for (Fruit fruit : fruits) {
			System.out.println(fruit);
		}
	}
	
	public static void main(String[] args) {
		Fruit apple = new Apple("apple", 3, "red");
		Fruit pear = new Pear("pear", 6, "grenn");
		Fruit orange = new Orange("orange", 9, "yellow");
		
		Box box = new Box();
		box.addFruit(apple);
		box.addFruit(pear);
		box.addFruit(orange);
		box.display();
	}
	
}
