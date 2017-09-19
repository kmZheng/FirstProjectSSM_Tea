package com.company.demo.service.dto;

import java.io.Serializable;

public class QueryResult implements Serializable {
	private static final long serialVersionUID = 1L;
	private String pname;
	private String refname;

	public QueryResult() {
		// TODO Auto-generated constructor stub
	}

	public QueryResult(String pname, String refname) {
		super();
		this.pname = pname;
		this.refname = refname;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getRefname() {
		return refname;
	}

	public void setRefname(String refname) {
		this.refname = refname;
	}

	@Override
	public String toString() {
		return "QueryResult [pname=" + pname + ", refname=" + refname + "]";
	}

}
