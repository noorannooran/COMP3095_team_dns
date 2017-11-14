package classes;

import java.util.Random;

import org.apache.tomcat.util.codec.binary.Base64;

public class User {

	
	private int userId; //primary key
	private String firstName;
	private String lastName;
	private String email;
	private String role;
	private String username;
	private String password;
	private String token;
	private int employeeId; //foreign key
	
	
	public User()
	{
		
	}
	//public constructor with userid - for select from database
	public User(int id, String first, String last, String email,
			String role, String username, String password)
	{
		this.userId = id;
		this.firstName = first;
		this.lastName = last;
		this.email = email;
		this.role = role;
		this.username = username;
		this.password= password;
	}
	
	public User(int id, String first, String last, String email, String role,
			String username, String password, String token) {
		this.userId = id;
		this.firstName = first;
		this.lastName = last;
		this.email = email;
		this.role = role;
		this.username = username;
		this.password = password;
		this.token = token;
	}
	
	public User(int id, String first, String last, String email,
			String role, String username, String password, int employeeId)
	{
		this.userId = id;
		this.firstName = first;
		this.lastName = last;
		this.email = email;
		this.role = role;
		this.username = username;
		this.password= password;
		this.employeeId = employeeId;
	}
	//getters and setters - delete whatever is unused
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int id) {
		this.employeeId = id;
	}
	public void createToken() {
		Random r = new Random();
		byte[] a = new byte[32];
		r.nextBytes(a);
		
		this.token = Base64.encodeBase64String(a);		
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	public String getToken() {
		return this.token;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}	
	
}
