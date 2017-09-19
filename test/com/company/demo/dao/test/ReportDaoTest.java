package com.company.demo.dao.test;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.company.demo.dao.mapper.ReportDao;
import com.company.demo.service.dto.QueryResult;
import com.company.demo.service.dto.QueryVO;

public class ReportDaoTest {

	private SqlSessionFactory sessionFactory;
	private SqlSession session;
	private ReportDao reportDao;

	@Before
	public void setUp() throws Exception {
		InputStream in = DemoDaoTest.class.getClassLoader().getResourceAsStream("mybatisConfig.xml");
		sessionFactory = new SqlSessionFactoryBuilder().build(in);
		session = sessionFactory.openSession();
		reportDao = session.getMapper(ReportDao.class);
		System.out.println(reportDao);
	}

	@After
	public void tearDown() throws Exception {
		if (session != null) {
			session.commit();
			session.close();
		}
	}

	@Test
	public void testFindListByDao() throws Exception {
		Date ptime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2017-09-10 12:00:00");
		QueryVO vo = new QueryVO(ptime, 80);
		List<QueryResult> results = reportDao.findListByDao(vo);
		for (QueryResult result : results) {
			System.out.println(result);
		}
	}

}
