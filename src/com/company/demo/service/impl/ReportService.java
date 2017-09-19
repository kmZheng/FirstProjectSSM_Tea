package com.company.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.demo.dao.mapper.ReportDao;
import com.company.demo.service.dto.QueryResult;
import com.company.demo.service.dto.QueryVO;
import com.company.demo.service.iservice.IReportService;
@Service
public class ReportService implements IReportService {

	@Autowired
	private ReportDao reportDao;
	
	@Override
	public List<QueryResult> findListByCon(QueryVO vo) {
		List<QueryResult> results = null;
		try {
			results = reportDao.findListByDao(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return results;
	}
}
