package com.company.demo.service.iservice;

import java.util.List;

import com.company.demo.service.dto.QueryResult;
import com.company.demo.service.dto.QueryVO;

public interface IReportService {
	
	//����ptime��price���Ƚ�ʱ��ͼ۸񣬷������������pname��refname��List���϶���
	public List<QueryResult> findListByCon(QueryVO vo);

//	//����ptime��price���Ƚ�ʱ��ͼ۸񣬷������������JSON�ַ���
//	public String findJsonByCon(QueryVO vo);
}
