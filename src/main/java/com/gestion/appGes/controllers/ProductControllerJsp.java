/*
package com.gestion.appGes.controllers;

import com.gestion.appGes.entities.Product;
import com.gestion.appGes.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ProductControllerJsp {
    @Autowired
    ProductService productService;
    @RequestMapping("/createProduct")
    public String createProduct(){
        return "CreateProduct";
    }
    @RequestMapping("/saveProduct")
    public String saveProduct(
            @ModelAttribute("product")Product product,
            @RequestParam("dateJsp") String dateController,
            ModelMap modelMap
            ) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateCreation = dateFormat.parse(String.valueOf(dateController));
        product.setDateCreate(dateCreation);

        Product memo = productService.saveProduct(product);
        String messageController = "The product whose Id : " + memo.getIdProduct() + " is saved";
        modelMap.addAttribute("messageJsp", messageController);
        return "CreateProduct";
    }
    @RequestMapping("/productsList")
    public String productsList(ModelMap modelMap){
        List<Product> productsController = productService.getAllProducts();
        modelMap.addAttribute("productsJsp", productsController);
        return "ProductsList";
    }
    @RequestMapping("/deleteProduct")
    public String deleteProduct(@RequestParam("id") Long id, ModelMap modelMap){
        productService.deleteProductById(id);
        List<Product> productsController = productService.getAllProducts();
        modelMap.addAttribute("productsJsp", productsController);
        return "ProductsList";
    }
    @RequestMapping("/showProduct")
    public String showProduct(@RequestParam("id") Long id, ModelMap modelMap){
        Product productController = productService.getProduct(id);
        modelMap.addAttribute("productJsp", productController);
        return "EditProduct";
    }
    @RequestMapping("/updateProduct")
    public String updateProduct(
            @ModelAttribute("product")Product product,
            @RequestParam("dateJsp") String dateController,
            ModelMap modelMap
    ) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateCreation = dateFormat.parse(String.valueOf(dateController));
        product.setDateCreate(dateCreation);

        Product memo = productService.saveProduct(product);
        return "CreateProduct";
    }
}
*/
