package pl.AP.Kredyty;

import org.springframework.web.bind.annotation.RestController;

import pl.AP.Kredyty.product.Product;
import pl.AP.Kredyty.product.ProductService;

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
public class ProductControler {
	
	
	private ProductService serv;
	@Autowired
	public ProductControler(ProductService serv)
	{
		this.serv=serv;
	}
	
	
	@GetMapping("/product")
	public List<Product> GetProducts() {
		return serv.getProduct();
	}

	@PostMapping("/product")
	public int CreateProduct(@RequestBody Product c) {
		
		
		return serv.createProduct(c);
	}
}
