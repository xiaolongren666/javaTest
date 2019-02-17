/**
 * 
 */
package xlr.chapter07.section04;

/**
*@Author:小龙人
*@File Name:AgeException.java
*@Created Time:2019年2月17日下午2:21:28
*@Introduce Function:自定义异常
*/
public class AgeException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AgeException () {
		
	}
	
	public AgeException (String msg) {
		super(msg);
	}
}
