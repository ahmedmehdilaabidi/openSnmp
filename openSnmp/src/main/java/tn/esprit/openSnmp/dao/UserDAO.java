package tn.esprit.openSnmp.dao;

import tn.esprit.openSnmp.domain.User;

public interface UserDAO {
	
	public User getUser(String username,String password);

}
