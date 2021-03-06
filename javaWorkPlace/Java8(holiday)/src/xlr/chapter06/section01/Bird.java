/**
 * 
 */
package xlr.chapter06.section01;

/**
*@Author:小龙人
*@File Name:Bird.java
*@Created Time:2019年2月9日下午2:51:05
*@Introduce Function:TODO
*/
public class Bird extends AbstractAnimal {

	
	/**
	 * 
	 */
	public Bird() {
	}

	/**
	 * 
	 * @param name
	 */
	public Bird(String name) {
		super(name);
	}
	
	/* (non-Javadoc)
	 * @see xlr.chapter06.section01.AbstractAnimal#action()
	 */
	@Override
	public void action() {
		System.out.println(this.getName() + "翅膀飞！");
	}

	/* (non-Javadoc)
	 * @see xlr.chapter06.section01.AbstractAnimal#call()
	 */
	@Override
	public void call() {
		System.out.println(this.getName() + "叽喳叫！");
	}
	
}
