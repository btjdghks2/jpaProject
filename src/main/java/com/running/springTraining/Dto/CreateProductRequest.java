package com.running.springTraining.Dto;

import com.running.springTraining.domain.Product;
import com.running.springTraining.domain.ProductDescription;
import lombok.Data;

@Data
public class CreateProductRequest {


        private Long id;
        private String name;
        private int productCount;
        private int price;
        private String textDescription;
        private String imagelink;

        public CreateProductRequest(Product product, ProductDescription productDescription) {
            this.id = product.getId();
            this.name = product.getName();
            this.productCount = product.getProductCount();
            this.price = product.getPrice();
            this.textDescription = productDescription.getTextDescription();
            this.imagelink = productDescription.getImagelink();
        }
}
