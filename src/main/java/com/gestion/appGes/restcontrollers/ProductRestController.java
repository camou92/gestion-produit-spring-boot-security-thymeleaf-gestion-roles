package com.gestion.appGes.restcontrollers;

import com.gestion.appGes.entities.Product;
import com.gestion.appGes.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
@AllArgsConstructor
public class ProductRestController {
    ProductService productService;
    @GetMapping
    List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("{idProduct}")
    public Product getProductById(@PathVariable("idProduct") Long idProduct){
        return productService.getProduct(idProduct);
    }
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
    @PutMapping
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }
    @DeleteMapping("{idProduct}")
    public void deleteProductById(@PathVariable("idProduct") Long idProduct){
        productService.deleteProductById(idProduct);
    }
}
