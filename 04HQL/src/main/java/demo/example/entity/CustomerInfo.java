package demo.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Info")
@Table(name="Info")
public class CustomerInfo {
	@Override
	public String toString() {
		return "CustomerInfo [Id=" + Id + ", name=" + name + ", email=" + email + "]";
	}
	public CustomerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="id")
	int Id;
	@Column(name="name")
	String name;
	@Column(name="mail")
	String email;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public CustomerInfo(int id,String name, String email) {
		super();
		this.name = name;
		this.email = email;
		Id = id;
	}
	
}
