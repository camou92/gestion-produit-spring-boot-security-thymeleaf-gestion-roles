package com.gestion.appGes.services;

import com.gestion.appGes.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    Product saveProduct(Product product);
    Product updateProduct(Product product);
    Product getProduct(Long id);
    List<Product> getAllProducts();
    void deleteProductById(Long id);
    void deleteAllProducts();
    Page<Product> getAllProductsByPage(int page, int size);
}
