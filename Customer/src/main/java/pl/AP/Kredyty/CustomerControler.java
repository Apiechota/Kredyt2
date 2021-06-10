package pl.AP.Kredyty;

import org.springframework.web.bind.annotation.RestController;

import pl.AP.Kredyty.customer.Customer;
import pl.AP.Kredyty.customer.CustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class CustomerControler {
	
	
	private CustomerService serv;
	@Autowired
	public CustomerControler(CustomerService serv)
	{
		this.serv=serv;
	}
	
	
	@GetMapping("/customer")
	public List<Customer> GetCustomers() {
		return serv.getCustomer();
	}

	@PostMapping("/customer")
	public int CreateCustomer(@RequestBody Customer c) {
		
		
		return serv.createCustomer(c);
	}
}
