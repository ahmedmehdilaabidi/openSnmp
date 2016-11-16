package tn.esprit.openSnmp.service;

import static org.junit.Assert.*;
import  org.junit.Test;

import tn.esprit.openSnmp.Service.UserService;
import tn.esprit.openSnmp.Service.impl.UserServiceImpl;



public class UserServiceTest {
	
	private UserService userService = new UserServiceImpl();
	
	@Test
	public void authenticate()
	{
		
	boolean existe = userService.authenticate("alaa", "1402");
	assertEquals(existe, true);
	}

}
