package Models;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity

public class Registration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull
	@Size(min = 4)
	private String firstName;
	@NotNull
	@Size(min = 4)
	private String lastName;
	@NotNull
	@Size(min = 4)
	private String userName;
	@NotNull
	@Email
	private String email;
	@NotNull
	@Size(min = 10 ,max = 10)
	private long mobileNo;
	@NotNull
	private boolean gender;
	@NotNull
	@Size(min = 4, max = 8)
	@Pattern(regexp = "(?=,*\\\\d)(?=,*[a-z])(?=,*[A-Z]).{8,}")
	private String password;
	@NotNull
	@Size(min = 4, max = 8)
	private String confirmPassword;
	@ManyToOne
	private Orders order;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Registration(long id, String firstName, String lastName, String userName, String email, long mobileNo,
			boolean gender, String password, String confirmPassword) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	
	

}
