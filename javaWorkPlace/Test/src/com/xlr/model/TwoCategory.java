package com.xlr.model;

public class TwoCategory extends Category{
	private int belong;

	public int getBelong() {
		return belong;
	}

	public void setBelong(int belong) {
		this.belong = belong;
	}
	
	public TwoCategory(int id,String name,int belong){
		this.setId(id);
		this.setName(name);
		this.belong = belong;
		
	}

}

