package com.scaler.productservicedecmwfeve.services;

import com.scaler.productservicedecmwfeve.exceptions.ProductNotExistsException;
import com.scaler.productservicedecmwfeve.models.Product;

import javax.print.attribute.standard.PresentationDirection;
import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long id) throws ProductNotExistsException;

    List<Product> getAllProducts();

    Product replaceProduct(Long id, Product product);

    void addProduct();

    void updateProduct();

    void deleteProduct();
}
