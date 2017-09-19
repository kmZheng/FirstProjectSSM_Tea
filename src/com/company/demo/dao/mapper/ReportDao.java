package com.company.demo.dao.mapper;

import java.util.List;

import com.company.demo.service.dto.QueryResult;
import com.company.demo.service.dto.QueryVO;

public interface ReportDao {
	public List<QueryResult> findListByDao(QueryVO vo)throws Exception;		
}
