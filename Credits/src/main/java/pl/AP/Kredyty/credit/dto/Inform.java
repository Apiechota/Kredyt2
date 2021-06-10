package pl.AP.Kredyty.credit.dto;

public class Inform {
	private String name;
	private int value;
	private String firstname;
	private String surname;
	private String pesel;	
	private String productname;
	public Inform() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Inform(String name, int value, String firstname, String surname, String pesel, String productname) {
		super();
		this.name = name;
		this.value = value;
		this.firstname = firstname;
		this.surname = surname;
		this.pesel = pesel;
		this.productname = productname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPesel() {
		return pesel;
	}
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	
	
	
	
	
	
	
}