package com.product.service;

import com.product.entity.ProductSellDto;
import com.product.mapper.ProductSellMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
//@Service("ProductSellService")
public class ProductSellServiceImpl implements ProductSellService {
        @Resource
        private ProductSellMapper mapper;
        @Override
        public List<ProductSellDto> findAll(){
            return mapper.findAll();
        }
        @Override
        public ProductSellDto findByid(String id){
            return mapper.findByid(id);
        }
}
