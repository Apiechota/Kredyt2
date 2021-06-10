package pl.AP.Kredyty.credit.dto;

import java.util.ArrayList;
import java.util.List;

import pl.AP.Kredyty.product.Product;

public class ProductList {
    private List<ProductDTO> products;

    public ProductList() {
        products = new ArrayList<>();
    }

	public List<ProductDTO> getProducts() {
		return products;
	}

	public void setProducts(List<ProductDTO> products) {
		this.products = products;
	}



}
