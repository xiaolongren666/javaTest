/**
 * 
 */
package xlr.chapter05.section02;

/**
*@Author:小龙人
*@File Name:AggregationDemo.java
*@Created Time:2019年2月8日下午6:50:15
*@Introduce Function:TODO
*/

class Employe {
	String name;

	/**
	 * @param name
	 */
	public Employe(String name) {
		super();
		this.name = name;
	}
	
	
}

class Department {
	Employe[] employes;

	/**
	 * @param employes
	 */
	public Department(Employe[] employes) {
		super();
		this.employes = employes;
	}
	
	void show() {
		for (Employe employe : employes) {
			System.out.println(employe);
		}
	}
}

/**
 * 
*@Author:小龙人
*@File Name:AggregationDemo.java
*@Created Time:2019年2月8日下午7:04:58
*@Introduce Function:TODO
 */
public class AggregationDemo {
	public static void main(String[] args) {
		Employe[] employes = {
			new Employe("张三"),	
			new Employe("李四"),	
			new Employe("王五"),	
			new Employe("马六")	
		};
		
		Department department = new Department(employes);
		department.show();
	}
}
