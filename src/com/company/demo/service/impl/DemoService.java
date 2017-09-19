package com.company.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.demo.dao.mapper.DemoDao;
import com.company.demo.dao.pojo.Demo;
import com.company.demo.service.iservice.IDemoService;

@Service
public class DemoService implements IDemoService {

	@Autowired
	private DemoDao demoDao;

	@Override
	public String save(Demo demo) {
		String msg = "error";
		try {
			demoDao.save(demo);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public List<Demo> findByName(String pname) {
		List<Demo> demos = null;
		try {
			demos = demoDao.findByName(pname);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return demos;
	}

}
