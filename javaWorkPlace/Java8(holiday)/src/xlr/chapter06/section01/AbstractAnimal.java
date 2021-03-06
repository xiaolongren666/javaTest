/**
 * 
 */
package xlr.chapter06.section01;

/**
*@Author:小龙人
*@File Name:Animal.java
*@Created Time:2019年2月9日下午2:46:16
*@Introduce Function:抽象类
*/
public abstract class AbstractAnimal {
	private String name;
	/**
	 * 
	 */
	public AbstractAnimal() {
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * @param name
	 */
	public AbstractAnimal(String name) {
		this.name = name;
	}



	/**
	 * 行动
	 */
	public abstract void action();
	
	/**
	 * 叫
	 */
	public abstract void call();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
