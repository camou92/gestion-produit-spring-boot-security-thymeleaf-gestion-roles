package com.gestion.appGes;

import com.gestion.appGes.entities.Category;
import com.gestion.appGes.entities.Product;
import com.gestion.appGes.repositories.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class AppGesApplicationTests {

	@Autowired
	ProduitRepository produitRepository;

	@Test
	public void TestCreateProduct(){
		Product product = new Product("Apple TV", 30000.00, new Date());
		produitRepository.save(product);
	}
	@Test
	public void TestUpdateProduct(){
		Product product = produitRepository.findById(1L).get();
		product.setPriceProduct(2500.00);
		produitRepository.save(product);
	}
	@Test
	public void TestFindProductById(){
		Product product = produitRepository.findById(1L).get();
		System.out.println(product);
	}
	@Test
	public void TestFindAllProducts(){
		List<Product> products = produitRepository.findAll();
		products.forEach(System.out::println);
	}
	@Test
	public void TestDeleteProductById(){
		produitRepository.deleteById(2L);
	}
	@Test
	public void TestDeleteAllProducts(){
		produitRepository.deleteAll();
	}
	@Test
	public void TestFindAllProductsByPrice(){
		List<Product> products = produitRepository.findAllProductsByPrice(20.00);
		products.forEach(System.out::println);
	}
	@Test
	public void findAllProductsByNamePrice(){
		List<Product> products = produitRepository.findAllProductsByNamePrice("Tv", 300.00);
		products.forEach(System.out::println);
	}
	@Test
	public void TestFindAllProductsByCategory(){
		Category category = new Category();
		category.setIdCategory(2L);
		List<Product> products = produitRepository.findAllProductsByCategory(category);
		products.forEach(System.out::println);
	}
	@Test
	public void findAllProductsByNameSort(){
		List<Product> products = produitRepository.findAllProductsByNameSort();
		products.forEach(System.out::println);
	}

}
