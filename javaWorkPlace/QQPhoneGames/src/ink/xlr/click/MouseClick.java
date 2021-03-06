/**
 * 
 */
package ink.xlr.click;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;

/**
*@Author:小龙人
*@File Name:MouseClick.java
*@Created Time:下午12:07:25
*@Introduce Function:鼠标点击，将鼠标放至指定位置
*/
public class MouseClick {
	/**
	 * 程序入口
	 * @param args
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception{
		
		
		
		Robot robot = new Robot();
		// 设置Robot动作后的休眠时间
		robot.setAutoDelay(10);
		// 鼠标点击次数
		long count = 0;
		
		// 鼠标点击
		while(true) {
			// 鼠标点击
			robot.mousePress(InputEvent.BUTTON1_MASK);
			System.out.println("鼠标点击次数：" + (++count));
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
		}
	}
}
