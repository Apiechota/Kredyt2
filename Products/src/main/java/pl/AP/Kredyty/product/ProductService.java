package pl.AP.Kredyty.product;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductService {

	private ProductRepository prep ;
	@Autowired
	public ProductService(ProductRepository prep) {
		this.prep=prep;
	}
	
	
	@Transactional
	public List<Product> getProduct() {
		return prep.findAll();
	}
	@Transactional
	public int createProduct(Product c) {
		return prep.save(c).getCreditid();
	}
	
}
