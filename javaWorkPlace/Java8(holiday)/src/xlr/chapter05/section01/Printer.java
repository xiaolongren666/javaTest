/**
 * 
 */
package xlr.chapter05.section01;

/**
*@Author:小龙人
*@File Name:Printer.java
*@Created Time:下午9:18:58
*@Introduce Function:TODO
*/
public class Printer extends Product{
	/** 颜色 */
	private String sColor;
	/** 纸张大小 */
	private String sApaperSize;
	

	/**
	 * 构造函数
	 * @param sType
	 * @param sManufacture
	 * @param dPrice
	 * @param sColor
	 * @param sApaperSize
	 */
	public Printer(String sType, String sManufacture, double dPrice,
			String sColor, String sApaperSize) {
		this.setsType(sType);;
		this.setsManufacture(sManufacture);
		this.setdPrice(dPrice);
		this.setsColor(sColor);
		this.setsApaperSize(sApaperSize);
	}
	
	/**
	 * 输出
	 */
	public void display() {
		System.out.println("类型:" + this.getsType());
		System.out.println("厂商:" + this.getsManufacture());
		System.out.println("价格:" + this.getdPrice());
		System.out.println("颜色:" + this.getsColor());
		System.out.println("纸张大小:" + this.getsApaperSize());
	}
	
	
	public String getsColor() {
		return sColor;
	}
	public void setsColor(String sColor) {
		this.sColor = sColor;
	}
	public String getsApaperSize() {
		return sApaperSize;
	}
	public void setsApaperSize(String sApaperSize) {
		this.sApaperSize = sApaperSize;
	}
	
	
}
