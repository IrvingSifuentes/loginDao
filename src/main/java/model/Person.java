package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="PERSON")
public class Person {
	
	
	@Id
	@GeneratedValue
	@Column(name="Id")
	private Integer id;
	@Column(name="Name")
	private String name ;
	@Column(name="Last_Name")
	private String lasName ;
	@Column(name="Email")
	private String email ;
	@Column(name="Age")
	private Integer age ;
	@Column(name="Address")
	private String address ;
	@Column(name="State")
	private String state ;
	@Column(name="City")
	private String city;
	@Column(name="Password")
	private String password ;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLasName() {
		return lasName;
	}
	public void setLasName(String lasName) {
		this.lasName = lasName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", lasName=" + lasName
				+ ", email=" + email + ", age=" + age + ", address=" + address
				+ ", state=" + state + ", city=" + city + ", password="
				+ password + "]";
	}

	

}
