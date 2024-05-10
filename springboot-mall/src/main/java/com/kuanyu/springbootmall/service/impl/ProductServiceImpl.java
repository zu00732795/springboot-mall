package com.kuanyu.springbootmall.service.impl;

import com.kuanyu.springbootmall.constant.ProductCategory;
import com.kuanyu.springbootmall.dao.ProductDao;
import com.kuanyu.springbootmall.dto.ProductQueryParams;
import com.kuanyu.springbootmall.dto.ProductRequest;
import com.kuanyu.springbootmall.model.Product;
import com.kuanyu.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getProducts(ProductQueryParams productQueryParams) {
        return productDao.getProducts(productQueryParams);
    }

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
        productDao.updateProduct(productId, productRequest);
    }

    @Override
    public void deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
    }
}
