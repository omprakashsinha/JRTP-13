package com.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao implements Dao
{
	
	public String findNameById(Integer id)
	{
		if(id ==101)
		{
			return "John";
			
		}
		else if(id==102)
		{
			return "Smith";
		}
		return null;
		
		
	}
	
public UserDao() {
	// TODO Auto-generated constructor stub
	System.out.println("UserDao:: COnstructor Called");
}	
	


}
