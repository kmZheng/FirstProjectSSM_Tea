package com.company.demo.service.dto;

import java.io.Serializable;
import java.util.Date;

public class QueryVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Date ptime;
	private double price;

	public QueryVO() {
		// TODO Auto-generated constructor stub
	}

	public QueryVO(Date ptime, double price) {
		super();
		this.ptime = ptime;
		this.price = price;
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

	@Override
	public String toString() {
		return "queryVO [ptime=" + ptime + ", price=" + price + "]";
	}

}
