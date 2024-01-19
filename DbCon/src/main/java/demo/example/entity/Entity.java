package demo.example.entity;

public class Entity {
	public Entity(int id, String name, String email) {
		super();
		this.id = id;
		Name = name;
		this.email = email;
	}
	//public Entity(int int1, String string, String string2) {
		// TODO Auto-generated constructor stub
	//}
	private int id;
	private String Name;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
