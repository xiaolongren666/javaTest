/**
 * 
 */
package xlr.chapter03.section06;

/**
*@Author:小龙人
*@File Name:Student.java
*@Created Time:下午10:00:03
*@Introduce Function:TODO
*/
public class Student {
	/** 名称 */
	private String name;
	/** 年纪 */
	private String grade;
	/** 分数 */
	private double score;
	
	/**
	 * 有参构造方法
	 * @param name
	 * @param grade
	 * @param score
	 */
	public Student(String name, String grade, double score) {
		super();
		this.name = name;
		this.grade = grade;
		this.score = score;
	}
	
	/**
	 * 属性输出
	 */
	public void display() {
		System.out.println("姓名:" + name );
		System.out.println("年级:" + grade);
		System.out.println("分数:" + score);
	}
	
}
