/**
 * 
 */
package ink.xlr.test;

import java.util.Random;
import java.util.Scanner;

/**
*@Author:小龙人
*@File Name:GuessNumber.java
*@Created Time:2019年3月21日下午2:26:45
*@Introduce Function:TODO
*/
public class GuessNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("猜数字游戏开始");
				System.out.println("输入1-100之间的数据：");
				
				//创建Random类变量
				Random ran = new Random();
				int ranNumber = ran.nextInt(100)+1;
				
				//创建Scanner类变量
				Scanner in = new Scanner(System.in);
				int up = 100;
				int down = 0;
				
				while(true) {
					int number = in.nextInt();
					if(number>ranNumber) {
						up = number;
					}else if(number<ranNumber) {
						down = number;
					}else {
						System.out.println("恭喜你，猜对了！");
						System.out.println("游戏结束！");
						break;
					}
					System.out.println("猜错了！在[" + down + "-" + up + "]范围内猜数！");
				}
				in.close();
	}
}
