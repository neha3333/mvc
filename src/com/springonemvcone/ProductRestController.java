package com.springonemvcone;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {

	private List<Product> products=new ArrayList<>();
	
	public ProductRestController() {
		// TODO Auto-generated constructor stub
		products.add(new Product(1,"pen",10f));
		products.add(new Product(2,"pencil",5f));
	}
	
	//@RequestMapping(path="/products", method=RequestMethod.GET)
	@GetMapping("/products")
	public List<Product> getProducts()
	{
		return products;	
	}
	
	@PostMapping("/products")
	public void add(@RequestBody Product p)
	{
		products.add(p);
	}
	
	@DeleteMapping("/products/{code}")
	public void delete(@PathVariable("code") int code){
		
		int index=-1;
		for (Product product : products) {
			if(product.getCode()==code)
				index=products.indexOf(product);
		}
		if(index!=-1)
			products.remove(index);
	}
	
	@PutMapping("/products/{code}")
	public void update(@PathVariable("code") int code, @RequestBody Product p)
	{
		for (Product product : products) {
			if(product.getCode()==code)
			{
				//product.setCode(p.getCode());
				product.setName(p.getName());
				product.setPrice(p.getPrice());
				
			}
		}
	}
}
