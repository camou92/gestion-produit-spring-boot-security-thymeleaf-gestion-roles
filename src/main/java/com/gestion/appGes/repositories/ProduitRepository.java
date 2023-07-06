package com.gestion.appGes.repositories;

import com.gestion.appGes.entities.Category;
import com.gestion.appGes.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitRepository extends JpaRepository<Product, Long> {
    @Query("select product from Product product where product.priceProduct >?1")
    List<Product> findAllProductsByPrice(Double priceProduct);

    @Query("select product from Product product where product.nameProduct like %:nameProduct and product.priceProduct >:priceProduct")
    List<Product> findAllProductsByNamePrice(@Param("nameProduct") String nameProduct, @Param("priceProduct") Double priceProduct);

    @Query("select product from Product product where product.category =?1")
    List<Product> findAllProductsByCategory(Category category);

    @Query("select product from Product product order by product.nameProduct")
    List<Product> findAllProductsByNameSort();
}
