package com.running.springTraining.Dto;

import com.running.springTraining.domain.Product;
import com.running.springTraining.domain.ProductDescription;
import lombok.Data;

@Data
public class ProductDetailDto {


        private Long id;
        private String name;
        private int productCount;
        private String textDescription;
        private String imagelink;


        public ProductDetailDto(ProductDescription productDescription, Product product) {
            this.id = productDescription.getId();
            this.name = product.getName();
            this.productCount = product.getProductCount();
            this.textDescription = productDescription.getTextDescription();
            this.imagelink = productDescription.getImagelink();
        }

}
