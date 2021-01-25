package com.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository("ReportDao")
public class ReportDao implements Dao {
	
	public ReportDao() {
	
		System.out.println("ReportDao::Constructor");
	}

	@Override
	public String findNameById(Integer id) {
		// TODO Auto-generated method stub
		if(id==101)
		{
			return"ReportDao SMith";
		}
		else if(id == 102)
		{
			return("Report John");
		}
		
		return null;
	}

}
