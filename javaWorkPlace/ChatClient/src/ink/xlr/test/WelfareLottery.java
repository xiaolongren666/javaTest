/**
 * 
 */
package ink.xlr.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
*@Author:小龙人
*@File Name:WelfareLottery.java
*@Created Time:2019年3月21日下午1:42:59
*@Introduce Function:TODO
*/
public class WelfareLottery {
	Set<Integer> list = new HashSet<Integer>();
	
	/**
	 * 随机生成五个1-23之间的数
	 * @return
	 */
	public void GenerateLottery() {
		while(true) {
			int i = (new Random().nextInt(22));
			list.add(i);
			if(list.size() == 5) {
				break;
			}
		}
	}
	
	public void PrintLottery() {
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
	
	public static void main(String[] args) {
		WelfareLottery wl = new WelfareLottery();
		wl.GenerateLottery();
		wl.PrintLottery();
	}
}
