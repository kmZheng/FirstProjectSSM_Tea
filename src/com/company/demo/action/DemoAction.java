package com.company.demo.action;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.demo.dao.pojo.Demo;
import com.company.demo.service.iservice.IDemoService;

@Controller
@RequestMapping("demomvc")
public class DemoAction {
	@Autowired
	private IDemoService demoService;
	
	@RequestMapping(value="save",method=RequestMethod.POST)
	public String save(@ModelAttribute("mydemo") Demo demo,Map<String,Object> model){
		System.out.println(demoService.save(demo));
		model.put("username", "SCOTT");
		return "result";
	}
	
	@RequestMapping(value="findByName",method=RequestMethod.GET)
	public String findByName(String name,Map<String,Object> model){
		List<Demo> demos = demoService.findByName(name);
		model.put("demosFromServer", demos);
		return "list";
	}
	
}
