package com.company.demo.service.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.demo.dao.pojo.Demo;
import com.company.demo.service.iservice.IDemoService;

public class DemoServiceTest {
	private ApplicationContext ctx;
	private IDemoService demoService;
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		demoService = (IDemoService) ctx.getBean("demoService");
		System.out.println("********************"+demoService);//Proxy
	}

	@Test
	public void testSave() throws Exception {
		Date pdate = new SimpleDateFormat("yyyy-MM-dd").parse("2017-06-01");
		Date ptime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2017-07-07 12:00:30");
		Demo demo = new Demo("sun", pdate, ptime, 10.9, 100, 1000);
		System.out.println(demoService.save(demo));
	}

	@Test
	public void testFindByName() {
		List<Demo> demos = demoService.findByName("n");
		for(Demo demo:demos){
			System.out.println(demo);
		}
	}

}
