package com.company.demo.service.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.demo.service.dto.QueryResult;
import com.company.demo.service.dto.QueryVO;
import com.company.demo.service.iservice.IReportService;

public class ReportServiceTest {

	private ApplicationContext ctx;
	private IReportService reportService;
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		reportService = (IReportService) ctx.getBean("reportService");
		System.out.println(reportService.getClass().getName());//Proxy
	}


	@Test
	public void testFindListByCon() throws Exception {
		Date ptime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2017-08-10 12:00:00");
		QueryVO vo = new QueryVO(ptime, 80);
		List<QueryResult> lists = reportService.findListByCon(vo);
		for(QueryResult result:lists){
			System.out.println(result);
		}
	}

}
