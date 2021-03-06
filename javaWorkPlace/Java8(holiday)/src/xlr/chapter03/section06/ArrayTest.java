/**
 * 
 */
package xlr.chapter03.section06;

/**
 * @Author:小龙人
 * @File Name:ArrayTest.java
 * @Created Time:下午9:59:03
 * @Introduce Function:TODO
 */
public class ArrayTest {
	/**
	 * 入口程序
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//对象数组
		Student[] student1 = new Student[2];
		student1[1] = new Student("小明", "3年级", 80);
		student1[0] = new Student("小明", "3年级", 80);

		Student[] student2 = new Student[] { 
				new Student("小明", "3年级", 80), 
				new Student("小明", "3年级", 80) 
				};

		Student[] student3 = { 
				new Student("小明", "3年级", 80), 
				new Student("小明", "3年级", 80) 
				};
		
		for (Student student : student3) {
			student.display();
			System.out.println("---------");
		}
	}

}
