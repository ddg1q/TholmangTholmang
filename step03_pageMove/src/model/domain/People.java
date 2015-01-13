package model.domain;

public class People {
	private String id;
	private String pw;
	private String name="정영석";
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
		
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = id;
	}
	
	
	@Override
	public String toString() {
		return "아이디는 " + id + " 비번은 " + pw + " 사용자는     " + name ;
	}
	public People(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name=name;
	}
	public People(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
		
	}
	
}
