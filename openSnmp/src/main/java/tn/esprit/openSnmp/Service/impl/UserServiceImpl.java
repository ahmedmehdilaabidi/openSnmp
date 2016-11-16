package tn.esprit.openSnmp.Service.impl;

import tn.esprit.openSnmp.Service.UserService;
import tn.esprit.openSnmp.dao.UserDAO;
import tn.esprit.openSnmp.dao.impl.UserDAOImpl;
import tn.esprit.openSnmp.domain.User;

public class UserServiceImpl implements UserService {

	private UserDAO userDao = new UserDAOImpl();

	public boolean authenticate(String username, String password) {
		User user = userDao.getUser(username, password);
		if (user == null)
			return false;
		return true;
	}

}
