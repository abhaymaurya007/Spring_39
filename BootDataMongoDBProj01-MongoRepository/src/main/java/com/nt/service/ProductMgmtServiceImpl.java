package com.nt.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.nt.document.Product;
import com.nt.repository.IProductRepository;

@Service
public class ProductMgmtServiceImpl implements IProductMgmtService {
	@Autowired
	private  IProductRepository prodRepo;
	
	@Override
	public String registerProduct(Product prod) {
		//save the document
		String idVal=prodRepo.save(prod).getId();
		return "Product is saved with id Value :"+idVal;
	}
	
	@Override
	public List<Product> showAllProducts() {
		return prodRepo.findAll();
	}
	
	@Override
	public Product showProdutById(String id) {
		return prodRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Id"));
	}
	
	@Override
	public String updatePrice(String pid, float hikePercent) {
		Product prod=prodRepo.findById(pid).orElseThrow(()->new IllegalArgumentException("Invalid Id"));
		prod.setPrice(prod.getPrice()+(prod.getPrice()*hikePercent/100.0f));
		prodRepo.save(prod);
		return  pid+" Product details are updated";
	}
	
	@Override
	public String registerProducts(List<Product> list) {
		//use repo
		List<Product> savedProds=prodRepo.saveAll(list);
		//collected id values of saved docs
		List<String> ids=savedProds.stream().map(Product::getId).collect(Collectors.toList());
		return ids.size()+" no.of   docs are saved having id values ::"+ids;
	}
	@Override
	public String removeProducts(String name, String status) {
		//prepare Docuemnt class obj  having given data
		Product prod=new Product();  prod.setStatus("active"); prod.setName("table");
		//prepare Example object
		Example<Product> example=Example.of(prod);
		//get the documents
		List<Product> list=prodRepo.findAll(example);
		//delete the docs
		prodRepo.deleteAll(list);
		return  list.size()+" no.of docs  are deleted";
		}

}
