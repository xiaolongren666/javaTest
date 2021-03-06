/**
 * 
 */
package xlr.chapter03.task;

/**
*@Author:小龙人
*@File Name:Point.java
*@Created Time:下午10:29:57
*@Introduce Function:TODO
*/
public class Point {
	/** x坐标 */
	private int x;
	/** y坐标 */
	private int y;
	
	/**
	 * 有参构造函数 
	 * @param x
	 * @param y
	 */
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
