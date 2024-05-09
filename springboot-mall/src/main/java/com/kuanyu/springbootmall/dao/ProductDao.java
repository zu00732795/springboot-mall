package com.kuanyu.springbootmall.dao;

import com.kuanyu.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
