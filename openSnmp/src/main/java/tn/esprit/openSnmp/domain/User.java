package tn.esprit.openSnmp.domain;

public class User {
	
	private Long userId;
	
	private String email;
	
	private String name;
	
	private String password;

	public Long getUserId() {
		return userId;
	}
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	

}
