package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ashokit.dao.Dao;

@Service
public class UserService {
	
	@Autowired
	@Qualifier("ReportDao")
	private Dao reportdao;
	

	
	public void printUsername(Integer id)
	{
		
		String name = reportdao.findNameById(id);
		System.out.println(name);
	}
	
	/*
	 * public UserService(UserDao dao) { // TODO Auto-generated constructor stub
	 * this.userDao=dao; System.out.println("1 param contructor is called"); }
	 */
	
	/*
	 * public UserService() { // TODO Auto-generated constructor stub
	 * 
	 * System.out.println("0 param constructor is called"); }
	 */
	/*
	 * public UserService(UserDao dao,ReportDao reportDao) { // TODO Auto-generated
	 * constructor stub this.userDao=dao; this.reportdao = reportDao;
	 * System.out.println("2 param contructor is called"); }
	 */
	
	
	
}
