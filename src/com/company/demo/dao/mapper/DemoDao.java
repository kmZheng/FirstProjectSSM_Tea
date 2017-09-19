package com.company.demo.dao.mapper;

import java.util.List;

import com.company.demo.dao.pojo.Demo;

public interface DemoDao {
	public void save(Demo demo)throws Exception;
	public List<Demo> findByName(String pname)throws Exception;
}
