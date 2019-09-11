package com.springonemvcone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginService {
	
	@Autowired
	private LoginDAO loginDAO;
	
	public boolean check(String login, String password)
	{
		return loginDAO.findAll(login, password);
	}

}
