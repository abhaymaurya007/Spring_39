package com.nt.service;

import java.util.List;

import com.nt.document.Product;

public interface IProductMgmtService {
	
	public   String registerProduct(Product prod);
	public  List<Product>  showAllProducts();
	public   Product   showProdutById(String id);
	public  String   updatePrice(String pid, float hikePercent);
	public   String   registerProducts(List<Product> list);
	public   String    removeProducts(String name ,String status);
	

}
