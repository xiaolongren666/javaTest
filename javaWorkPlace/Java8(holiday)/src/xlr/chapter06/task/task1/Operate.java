/**
 * 
 */
package xlr.chapter06.task.task1;

/**
*@Author:小龙人
*@File Name:Math.java
*@Created Time:2019年2月9日下午6:51:43
*@Introduce Function:TODO
*/
public class Operate implements MathInteface {

	@Override
	public int math(int num1, int num2, char operate) {
		int sum = 0;
		switch(operate){
			case '+':
				sum = num1 + num2;
				break;
			case '-':
				sum = num1 - num2;
				break;
			case '*':
				sum = num1 * num2;
				break;
			case '/':
				sum = num1 / num2;
				break;
			default:
				System.out.println("输入错误！");
		}
		return sum;
	}
	
}
