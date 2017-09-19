package com.company.demo.dao.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Demo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int pid;
	private String pname;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date pdate;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date ptime;	
	private double price;
	private int pnum;
	private int refid;

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public Demo(String pname, Date pdate, Date ptime, double price, int pnum, int refid) {
		super();
		this.pname = pname;
		this.pdate = pdate;
		this.ptime = ptime;
		this.price = price;
		this.pnum = pnum;
		this.refid = refid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Date getPdate() {
		return pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

	public Date getPtime() {
		return ptime;
	}

	public void setPtime(Date ptime) {
		this.ptime = ptime;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPnum() {
		return pnum;
	}

	public void setPnum(int pnum) {
		this.pnum = pnum;
	}

	public int getRefid() {
		return refid;
	}

	public void setRefid(int refid) {
		this.refid = refid;
	}

	@Override
	public String toString() {
		return "Demo [pid=" + pid + ", pname=" + pname + ", pdate=" + pdate + ", ptime=" + ptime + ", price=" + price
				+ ", pnum=" + pnum + ", refid=" + refid + "]";
	}

}
