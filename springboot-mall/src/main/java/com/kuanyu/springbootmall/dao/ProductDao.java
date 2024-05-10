package com.kuanyu.springbootmall.dao;

import com.kuanyu.springbootmall.dto.ProductQueryParams;
import com.kuanyu.springbootmall.dto.ProductRequest;
import com.kuanyu.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void  updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
