package com.nt.runners;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Product;
import com.nt.service.IProductMgmtService;

@Component
public class MongoRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private  IProductMgmtService prodService;

	@Override
	public void run(String... args) throws Exception {
		/*	try {
				Product prod=new Product();
				prod.setName("milk"); prod.setPrice(100.0f); prod.setQty(5.0f); 
				prod.setCompany("Amul"); prod.setExpiryDate(LocalDate.of(2025, 10 ,20));
				//use service
				String idVal=prodService.registerProduct(prod);
				System.out.println("Product is saved with id Value::"+idVal);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		/*	  try {
			          prodService.showAllProducts().forEach(System.out::println);	  
			  }
			catch(Exception  e) {
				e.printStackTrace();
			}*/
		
		/*	try {
			   Product prod=prodService.showProdutById("168314a5d6c4bc94daaccdfc3");
			   System.out.println("The details are ::"+prod);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		/*	try {
				String msg=prodService.updatePrice("68314a5d6c4bc94daaccdfc3", 5.0f);
				System.out.println(msg);
			}
			catch(Exception  e) {
				e.printStackTrace();
			}
			*/
		/*try {
			Product prod1=new Product(); prod1.setName("table"); prod1.setPrice(454455.0f);
			Product prod2=new Product(); prod2.setName("chair"); prod2.setPrice(1414155.0f); prod2.setQty(10.0f);
			
			String msg=prodService.registerProducts(List.of(prod1,prod2));
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		/*		try {
					String msg=prodService.removeProducts("table", "active");
					System.out.println(msg);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		*/
		
		try {
			Product prod=new Product();
			prod.setId(UUID.randomUUID().toString());
			prod.setName("milk"); prod.setPrice(100.0f); prod.setQty(5.0f); 
			prod.setCompany("Amul"); prod.setExpiryDate(LocalDate.of(2025, 10 ,20));
			//use service
			String idVal=prodService.registerProduct(prod);
			System.out.println("Product is saved with id Value::"+idVal);
		
		}
		catch(Exception  e) {
			e.printStackTrace();
		}
	}

}
