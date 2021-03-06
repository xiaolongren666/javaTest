/**
 * 
 */
package xlr.chapter05.section03;

/**
*@Author:小龙人
*@File Name:Cow.java
*@Created Time:2019年2月8日下午7:19:15
*@Introduce Function:成员内部类
*/
public class Cow {
	/** 体重 */
	private double weight;

	/**
	 * @param weight
	 */
	public Cow(double weight) {
		super();
		this.weight = weight;
	}
	
	private class CowLeg {
		/** 长度 */
		private double length;
		/** 颜色 */
		private String color;
		
		/**
		 * @param length
		 * @param color
		 */
		public CowLeg(double length, String color) {
			super();
			this.length = length;
			this.color = color;
		}
		
		public void info() {
			System.out.println("当前牛腿的颜色是:" + color + ",长度:" + length);
			System.out.println("奶牛的重量:" + weight);
		}
	}
	
	public void test() {
		CowLeg  cowLeg = new CowLeg(1.12, "黑白相间");
		cowLeg.info();
	}
	
	public static void main(String[] args) {
		Cow cow = new Cow(378.9);
		cow.test();
	}
}
