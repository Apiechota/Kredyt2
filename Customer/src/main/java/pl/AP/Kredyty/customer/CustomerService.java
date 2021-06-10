package pl.AP.Kredyty.customer;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CustomerService {

	private CustomerRepository crep ;
	@Autowired
	public CustomerService(CustomerRepository crep) {
		this.crep=crep;
	}
	
	@Transactional
	public List<Customer> getCustomer() {
		return crep.findAll();
	}
	@Transactional
	public int createCustomer(Customer c) {
		return crep.save(c).getCreditid();
	}
	
}
