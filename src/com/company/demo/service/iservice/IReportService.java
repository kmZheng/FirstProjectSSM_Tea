package com.company.demo.service.iservice;

import java.util.List;

import com.company.demo.service.dto.QueryResult;
import com.company.demo.service.dto.QueryVO;

public interface IReportService {
	
	//输入ptime和price，比较时间和价格，符合条件，输出pname和refname的List集合对象
	public List<QueryResult> findListByCon(QueryVO vo);

//	//输入ptime和price，比较时间和价格，符合条件，输出JSON字符串
//	public String findJsonByCon(QueryVO vo);
}
