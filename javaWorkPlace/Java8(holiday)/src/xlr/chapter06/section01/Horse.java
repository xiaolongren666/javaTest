/**
 * 
 */
package xlr.chapter06.section01;

/**
*@Author:小龙人
*@File Name:Horse.java
*@Created Time:2019年2月9日下午2:55:05
*@Introduce Function:TODO
*/
public class Horse extends AbstractAnimal {
	/**
	 * 
	 */
	public Horse() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public Horse(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void action() {
		System.out.println(this.getName() + "四条腿奔跑！");
	}

	@Override
	public void call() {
		System.out.println(this.getName() + "长啸！");
	}
	
}
