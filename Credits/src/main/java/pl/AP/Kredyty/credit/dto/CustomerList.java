package pl.AP.Kredyty.credit.dto;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
    private List<CustomerDTO> customer;

    public CustomerList() {
    	customer = new ArrayList<>();
    }

	public List<CustomerDTO> getCustomer() {
		return customer;
	}

	public void setCustomer(List<CustomerDTO> customer) {
		this.customer = customer;
	}

}
