/**
 * 
 */
package xlr.chapter03.task;

import java.util.Calendar;
import java.util.Random;

/**
*@Author:小龙人
*@File Name:PointDemo.java
*@Created Time:下午10:31:32
*@Introduce Function:TODO
*/
public class PointDemo {
	/**
	 * 计算两个坐标之间的距离
	 * @param point1
	 * @param point2
	 * @return
	 */
	public double calculateDistance(Point point1, Point point2) {
		int xDistance = Math.abs(point1.getX() - point2.getX());
		int yDistance = Math.abs(point1.getY() - point2.getY());
		// (x1 - x2)^2 + (y1 - y2)^2 再开方为两个坐标的距离
		return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
	}
	
	/**
	 * 入口函数
	 */
	public static void main(String[] args) {
		Point point1 = new Point(new Random().nextInt(20), new Random().nextInt(20));
		Point point2 = new Point(new Random().nextInt(20), new Random().nextInt(20));
		
		PointDemo pointDemo = new PointDemo();
		System.out.println("point1" + point1 + "\npoint2" + point2 
				+ "\n之间的距离:" + pointDemo.calculateDistance(point1, point2)); 
		
	}
}
