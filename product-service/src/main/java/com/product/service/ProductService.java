package com.product.service;

import com.product.data.dto.ProductRequest;
import com.product.data.dto.ProductResponse;
import com.product.data.entity.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
