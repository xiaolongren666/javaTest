/**
 * 
 */
package xlr.chapter05.section02;

/**
*@Author:小龙人
*@File Name:CompositionDemo.java
*@Created Time:2019年2月8日下午7:05:47
*@Introduce Function:TODO
*/

/**
 * 
*@Author:小龙人
*@File Name:CompositionDemo.java
*@Created Time:2019年2月8日下午7:07:36
*@Introduce Function:发动机
 */
class Engine {
}

/**
 * 
*@Author:小龙人
*@File Name:CompositionDemo.java
*@Created Time:2019年2月8日下午7:07:47
*@Introduce Function:底盘
 */
class Chassis {
}

/**
 * 
*@Author:小龙人
*@File Name:CompositionDemo.java
*@Created Time:2019年2月8日下午7:08:52
*@Introduce Function:车身
 */
class BodyWork {
}

/**
 * 
*@Author:小龙人
*@File Name:CompositionDemo.java
*@Created Time:2019年2月8日下午7:09:34
*@Introduce Function:电路
 */
class Circuitry {
}

class Car2 {
	/** 发动机 */
	Engine engine;
	/** 底盘 */
	Chassis chassis;
	/** 车身 */
	BodyWork bodyWork;
	/** 电路 */
	Circuitry circuitry;
	
	/**
	 * 有参构造方法
	 * @param engine
	 * @param chassis
	 * @param bodyWork
	 * @param circuitry
	 */
	public Car2(Engine engine, Chassis chassis, BodyWork bodyWork, Circuitry circuitry) {
		super();
		this.engine = engine;
		this.chassis = chassis;
		this.bodyWork = bodyWork;
		this.circuitry = circuitry;
	}
}

/**
 * 
*@Author:小龙人
*@File Name:CompositionDemo.java
*@Created Time:2019年2月8日下午7:15:07
*@Introduce Function:组合关系
 */
public class CompositionDemo {
	public static void main(String[] args) {
		Engine engine = new Engine();
		Chassis chassis = new Chassis();
		BodyWork bodyWork = new BodyWork();
		Circuitry circuitry = new Circuitry();
		@SuppressWarnings("unused")
		Car2 car2 = new Car2(engine, chassis, bodyWork, circuitry);
	}
}
