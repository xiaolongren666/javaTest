/**
 * 
 */
package xlr.chapter05.task;

/**
*@Author:小龙人
*@File Name:Fruit.java
*@Created Time:2019年2月8日下午10:15:14
*@Introduce Function:TODO
*/
public class Fruit {
	/** 名称 */
	private String name;
	/** 重量 */
	private int weight;
	/** 颜色 */
	private String color;

	
	
	/**
	 * @param name
	 * @param weight
	 * @param color
	 */
	public Fruit(String name, int weight, String color) {
		super();
		this.name = name;
		this.weight = weight;
		this.color = color;
	}

	public String toString() {
		return "名称：" + name + "，重量：" + weight + ",颜色:" + color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
