package com.company.demo.action;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.company.demo.dao.pojo.Demo;
import com.company.demo.service.iservice.IDemoService;

@Controller
@RequestMapping("demorest")
public class DemoRESTAction {
	@Autowired
	private IDemoService demoService;
	
	@RequestMapping(value="demo",method=RequestMethod.POST)
	public String save(@ModelAttribute("mydemo") Demo demo,Map<String,Object> model){
		System.out.println(demoService.save(demo));
		model.put("username", "SCOTT");
		return "result";
	}
	
	@RequestMapping(value="demos/{pname}",method=RequestMethod.GET)
	public @ResponseBody List<Demo> findByName(@PathVariable("pname") String name){
		List<Demo> demos = demoService.findByName(name);
		return demos;
	}
	
}
