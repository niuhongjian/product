package com.product.service;

import com.product.entity.ProductSellDto;

import java.util.List;

public interface ProductSellService {
    public List<ProductSellDto> findAll() ;

    public ProductSellDto findByid(String id);
}
