package com.blog.friend.entity;

public class Friend {
	private int fid;//好友ID
	private String fname;//好友姓名
	private int fage;//好友年龄
	private String fsex;//好友性别
	
	public Friend() {
		super();
	}
	public Friend(int fid, String fname, int fage,String fsex) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.fage = fage;
		this.fsex = fsex;

	}
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getFage() {
		return fage;
	}
	public void setFage(int fage) {
		this.fage = fage;
	}
	public String getFsex() {
		return fsex;
	}
	public void setFsex(String fsex) {
		this.fsex = fsex;
	}

	

}
