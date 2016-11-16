package tn.esprit.openSnmp.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import tn.esprit.openSnmp.dao.UserDAO;
import tn.esprit.openSnmp.domain.User;
import tn.esprit.openSnmp.util.DataBase;

public class UserDAOImpl implements UserDAO {

	public User getUser(String username, String password) {

		User user = null;

		String sql;
		Connection con = DataBase.getInstance().getConnections("jdbc:mysql://localhost:3306/db_monitoring", "root", "");
		Statement stmt = null;
		// STEP 4: Execute a query
		System.out.println("Creating statement...");
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sql = "SELECT * FROM users where name='" + username + "' and password='" + password + "'";
		try {
			ResultSet rs = stmt.executeQuery(sql);

			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				long id = rs.getLong("user_id");
				String email = rs.getString("email");
				String name = rs.getString("name");
				String pass = rs.getString("password");

				// Display values
				System.out.print("ID: " + id);
				System.out.print(", email: " + email);
				System.out.print(", name: " + name);
				System.out.println(", password: " + pass);

				user = new User();
				user.setUserId(id);
				user.setName(name);
				user.setPassword(password);
				user.setEmail(email);

			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			con.close();

			if (user != null)
				return user;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
