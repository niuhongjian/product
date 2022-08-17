package com.product.controller;

import com.product.entity.ProductSellDto;
import com.product.service.ProductSellService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Component
@RestController
public class ProductSellController {

    @Resource
    private ProductSellService productSellService;
    @RequestMapping("/person")
    @ResponseBody//json返回
    public List<ProductSellDto> findAll(){
        List<ProductSellDto> list = productSellService.findAll();
        return list;
    }
    @RequestMapping("/findPersonByid/{id}")
    @ResponseBody//返回json类型
    public ProductSellDto findByid(@PathVariable("id") String id){
        return productSellService.findByid(id);//{}
    }

}
