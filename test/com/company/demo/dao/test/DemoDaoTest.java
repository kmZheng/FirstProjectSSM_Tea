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

import com.company.demo.dao.mapper.DemoDao;
import com.company.demo.dao.pojo.Demo;

public class DemoDaoTest {

	private SqlSessionFactory sessionFactory;
	private SqlSession session;
	private DemoDao demoDao;

	@Before
	public void setUp() throws Exception {
		InputStream in = DemoDaoTest.class.getClassLoader().getResourceAsStream("mybatisConfig.xml");
		sessionFactory = new SqlSessionFactoryBuilder().build(in);
		session = sessionFactory.openSession();
		demoDao = session.getMapper(DemoDao.class);
		System.out.println(demoDao);
	}

	@After
	public void tearDown() throws Exception {
		if (session != null) {
			session.commit();
			session.close();
		}
	}

	@Test
	public void testSave() throws Exception {
		Date pdate = new SimpleDateFormat("yyyy-MM-dd").parse("2017-01-01");
		Date ptime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2017-09-18 12:00:30");
		Demo demo = new Demo("qian", pdate, ptime, 90.9, 100, 1001);
		demoDao.save(demo);
		System.out.println("save success:" + demo);
	}

	@Test
	public void testFindByName() throws Exception {
		List<Demo> demos = demoDao.findByName("z");
		for(Demo demo:demos){
			System.out.println(demo);
		}
	}

}
