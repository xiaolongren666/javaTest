/**
 * 
 */
package xlr.chapter05.section01;

/**
*@Author:小龙人
*@File Name:Mobile.java
*@Created Time:下午9:23:03
*@Introduce Function:TODO
*/
public class Mobile extends Product{
	
	/** 屏幕尺寸 */
	private String sScreenSize;
	/** CPU */
	private String sCpu;
	
	
	
	/**
	 * 构造函数
	 * @param sType
	 * @param sManufacture
	 * @param dPrice
	 * @param sScreenSize
	 * @param sCpu
	 */
	public Mobile(String sType, String sManufacture, double dPrice,
			String sScreenSize, String sCpu) {
		this.setsType(sType);;
		this.setsManufacture(sManufacture);
		this.setdPrice(dPrice);
		this.setsScreenSize(sScreenSize);
		this.setsCpu(sCpu);
	}
	
	/**
	 * 输出
	 */
	public void display() {
		System.out.println("类型:" + this.getsType());
		System.out.println("厂商:" + this.getsManufacture());
		System.out.println("价格:" + this.getdPrice());
		System.out.println("屏幕尺寸:" + this.getsScreenSize());
		System.out.println("CPU:" + this.getsCpu());
	}
	
	public String getsScreenSize() {
		return sScreenSize;
	}
	public void setsScreenSize(String sScreenSize) {
		this.sScreenSize = sScreenSize;
	}
	public String getsCpu() {
		return sCpu;
	}
	public void setsCpu(String sCpu) {
		this.sCpu = sCpu;
	}
}
