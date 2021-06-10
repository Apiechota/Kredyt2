package pl.AP.Kredyty.credit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import pl.AP.Kredyty.credit.dto.CustomerDTO;
import pl.AP.Kredyty.credit.dto.CustomerList;
import pl.AP.Kredyty.credit.dto.Inform;
import pl.AP.Kredyty.credit.dto.ProductDTO;
import pl.AP.Kredyty.credit.dto.ProductList;
import pl.AP.Kredyty.product.*;

@Service
public class CreditService {


	@Autowired
	private CreditRepository crep ;
	@Autowired
	public CreditService(CreditRepository crep) {
		this.crep=crep;
	}
	

	
	
	
	
	@Transactional
	public List<Inform> getCredit() {
		RestTemplate restTemplate = new RestTemplate();
		
		List<Inform> list=new ArrayList<Inform>();
		List<Credit> crlist=crep.findAll();
		ProductDTO[] plist=restTemplate.getForObject("http://localhost:8082/product", ProductDTO[].class);
		CustomerDTO[] clist=restTemplate.getForObject("http://localhost:8081/customer", CustomerDTO[].class);
		for(int i=0;i<crlist.size();i++)
		list.add(new Inform(crlist.get(i).getName(),plist[i].getValue(),clist[i].getFirstname(),clist[i].getSurname(),clist[i].getPesel(),plist[i].getProductName()));
		return list;
	}
	@Transactional
	public int createCredit(Inform c) {
		
		RestTemplate restTemplate = new RestTemplate(); 
		
		int a=crep.save(new Credit(c.getName())).getId();
		
		restTemplate.postForObject("http://localhost:8082/product", new ProductDTO(a, c.getProductname(),c.getValue()), ProductDTO.class);
		restTemplate.postForObject("http://localhost:8081/customer",new CustomerDTO(a,c.getFirstname(),c.getSurname(),c.getPesel()) , CustomerDTO.class);
		
		
		return a;
	}
	
	
}
