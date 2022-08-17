package com.product.mapper;

import com.product.entity.ProductSellDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductSellMapper {
    public List<ProductSellDto> findAll();

    public ProductSellDto findByid(@Param("id") String id) ;
}
