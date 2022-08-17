package com.product.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductSellDto implements Serializable {
        private static final long serialVersionUID = -6172780607087661025L;
        private String code;
        private String name;
        private String p_size;
        private String picture;
        private String biko;

}
