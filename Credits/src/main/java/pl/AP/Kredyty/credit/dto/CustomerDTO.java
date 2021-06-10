package pl.AP.Kredyty.credit.dto;


public class CustomerDTO {

private int creditid;
private String Firstname;
private String Surname;
private String Pesel;
public CustomerDTO() {
	super();
	// TODO Auto-generated constructor stub
}
public CustomerDTO(int creditid, String firstname, String surname, String pesel) {
	super();
	this.creditid = creditid;
	Firstname = firstname;
	Surname = surname;
	Pesel = pesel;
}
public CustomerDTO(int creditid) {
	super();
	this.creditid = creditid;
}
public int getCreditid() {
	return creditid;
}
public void setCreditid(int creditid) {
	this.creditid = creditid;
}
public String getFirstname() {
	return Firstname;
}
public void setFirstname(String firstname) {
	Firstname = firstname;
}
public String getSurname() {
	return Surname;
}
public void setSurname(String surname) {
	Surname = surname;
}
public String getPesel() {
	return Pesel;
}
public void setPesel(String pesel) {
	Pesel = pesel;
}
@Override
public String toString() {
	return "Customer [creditid=" + creditid + ", Firstname=" + Firstname + ", Surname=" + Surname + ", Pesel=" + Pesel
			+ "]";
}


}
