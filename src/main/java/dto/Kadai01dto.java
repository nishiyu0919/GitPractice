package dto;

public class Kadai01dto {
	private int id;
	private String name;
	private int age;
	private String type;
	private String number;
	private String mail;
	private String pass;
	private String salt;
	private String hashedPassword;
	
	public Kadai01dto(int id, String name, int age, String type, String number, String mail, String pass, String salt, String hashedPassword) {
		super();
		this.id= id;
		this.name = name;
		this.age = age;
		this.type = type;
		this.number = number;
		this.mail = mail;
		this.pass = pass;
		this.salt=salt;
		this.hashedPassword = hashedPassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getHashedPassword() {
		return hashedPassword;
	}

	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}

	

}

