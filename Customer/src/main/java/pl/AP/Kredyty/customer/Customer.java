package pl.AP.Kredyty.customer;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table
public class Customer {
	@Id
private int creditid;
private String Firstname;
private String Surname;
private String Pesel;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(int creditid, String firstname, String surname, String pesel) {
	super();
	this.creditid = creditid;
	Firstname = firstname;
	Surname = surname;
	Pesel = pesel;
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
