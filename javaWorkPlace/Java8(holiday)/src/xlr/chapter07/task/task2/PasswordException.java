/**
 * 
 */
package xlr.chapter07.task.task2;

/**
*@Author:小龙人
*@File Name:PasswordException.java
*@Created Time:2019年2月17日下午3:01:04
*@Introduce Function:PasswordException异常类
*/
public class PasswordException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PasswordException() {
		
	}
	
	public PasswordException(String msg) {
		super(msg);
	}
}
