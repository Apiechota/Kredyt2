package pl.AP.Kredyty.credit.dto;



public class ProductDTO {

private int creditid;
private String productname;
private int value;
public ProductDTO(int creditid, String productname, int value) {
	
	this.creditid = creditid;
	this.productname = productname;
	this.value = value;
}
public ProductDTO() {
	super();
	// TODO Auto-generated constructor stub
}



public ProductDTO(int creditid) {
	super();
	this.creditid = creditid;
}
public int getCreditid() {
	return creditid;
}
public void setCreditid(int creditid) {
	this.creditid = creditid;
}
public String getProductName() {
	return productname;
}
public void setProductName(String productname) {
	this.productname = productname;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}


@Override
public String toString() {
	return "Product [creditid=" + creditid + ", productname=" + productname + ", value=" + value + "]";
}

}
