package com.company.demo.service.iservice;

import java.util.List;

import com.company.demo.dao.pojo.Demo;

public interface IDemoService {
	public String save(Demo demo);
	public List<Demo> findByName(String pname);
}
