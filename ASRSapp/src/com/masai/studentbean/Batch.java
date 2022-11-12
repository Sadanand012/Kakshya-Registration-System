package com.masai.studentbean;

public class Batch {

	private int bid;
	private String name;
	private int broll;
	
	public Batch() {
		// TODO Auto-generated constructor stub
	}

	public Batch(int bid, String name, int broll) {
		super();
		this.bid = bid;
		this.name = name;
		this.broll = broll;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBroll() {
		return broll;
	}

	public void setBroll(int broll) {
		this.broll = broll;
	}

	@Override
	public String toString() {
		return "Batch [bid=" + bid + ", name=" + name + ", broll=" + broll + "]";
	}
	
}
