package com.blog.friend.entity;

public class Friend {
	private int fid;//����ID
	private String fname;//��������
	private int fage;//��������
	private String fsex;//�����Ա�
	
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
