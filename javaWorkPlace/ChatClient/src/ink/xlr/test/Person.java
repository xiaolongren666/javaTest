/**
 * 
 */
package ink.xlr.test;

/**
*@Author:小龙人
*@File Name:Person.java
*@Created Time:2019年3月21日上午11:39:11
*@Introduce Function:TODO
*/
public class Person implements Serve {
	private String name;
	private String eatPlace;
	private String accommodation;
	
	/** 常量 */
	private final String STUDENT="Student";
	private final String TEACHER="Teacher";
	private final String PARENTS="Parents";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEatPlace() {
		return eatPlace;
	}
	public void setEatPlace(String eatPlace) {
		this.eatPlace = eatPlace;
	}
	public String getAccommodation() {
		return accommodation;
	}
	public void setAccommodation(String accommodation) {
		this.accommodation = accommodation;
	}
	/* (non-Javadoc)
	 * @see ink.xlr.test.Serve#ArrangeEat()
	 */
	@Override
	public void ArrangeEat() {
		if(STUDENT.equalsIgnoreCase(name)) {
			this.eatPlace = "食堂";
		}else if(TEACHER.equalsIgnoreCase(name)) {
			this.eatPlace = "教师食堂";
		}else if(PARENTS.equalsIgnoreCase(name)){
			this.eatPlace = "宾馆";
		}
	}
	/* (non-Javadoc)
	 * @see ink.xlr.test.Serve#ArrangeSleep()
	 */
	@Override
	public void ArrangeSleep() {
		if(STUDENT.equalsIgnoreCase(name)) {
			this.accommodation = "宿舍";
		}else if(TEACHER.equalsIgnoreCase(name)) {
			this.accommodation = "学校公寓";
		}else if(PARENTS.equalsIgnoreCase(name)) {
			this.accommodation = "宾馆";
		}
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", eatPlace=" + eatPlace + ", accommodation=" + accommodation + "]";
	}
	
	
	
	
}
