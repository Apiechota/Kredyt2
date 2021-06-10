package pl.AP.Kredyty;

import org.springframework.web.bind.annotation.RestController;

import pl.AP.Kredyty.credit.Credit;
import pl.AP.Kredyty.credit.CreditService;
import pl.AP.Kredyty.credit.dto.Inform;

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
public class KredytControler {
	
	
	private CreditService serv;
	@Autowired
	public KredytControler(CreditService serv)
	{
		this.serv=serv;
	}
	
	
	@GetMapping("/")
	public List<Inform> index() {
		return serv.getCredit();
	}

	@PostMapping("/")
	public int CreateCredit(@RequestBody Inform c) {
		
		
		return serv.createCredit(c);
	}
}
