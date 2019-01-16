package com.xlr.model;
public class Audio {
	private int id;
	private String name;
	private String path1;
	private int flag;
	private int belong;
	private String tearchername;
	private int time;
	private  String content;
	public Audio(int id, String name, String path1,int flag,int belong, String tearchername, int time, String content) {
		this.id = id;
		this.name = name;
		this.path1 = path1;
		this.flag = flag;
		this.belong = belong;
		this.tearchername=tearchername;
		this.time=time;
		this.content=content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath1() {
		return path1;
	}
	public void setPath1(String path1) {
		this.path1 = path1;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public int getBelong() {
		return belong;
	}
	public void setBelong(int belong) {
		this.belong = belong;
	}
	public String getTearchername() {
		return tearchername;
	}
	public void setTearchername(String tearchername) {
		this.tearchername = tearchername;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
