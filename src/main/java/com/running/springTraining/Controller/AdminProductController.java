package com.running.springTraining.Controller;

import com.running.springTraining.Repository.MainPageRepository;
import com.running.springTraining.Service.AdminProductService;
import com.running.springTraining.domain.Product;
import com.running.springTraining.domain.ProductDescription;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Column;
import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class AdminProductController {

    private final MainPageRepository mainPageRepository;
    private final AdminProductService adminProductService;

    @PostMapping("/api/admin/new")
    public CreateProductResponse ProductSave(@RequestBody @Valid CreateProductRequest request) {

        Product product = new Product();
        product.setName(request.getName());
        product.setId(request.getId());
        product.setPrice(request.getPrice());
        product.setProductCount(request.getProductCount());

        Long id = adminProductService.join(product);
        return new CreateProductResponse();

    }

    @Data
    static class CreateProductResponse {

        private Long id;
        private String name;
        private int productCount;
        private int price;
        private String textDescription;
        private String imagelink;

        public CreateProductResponse(Product product, ProductDescription productDescription) {
            this.id = product.getId();
            this.name = product.getName();
            this.productCount = product.getProductCount();
            this.price = product.getPrice();
            this.textDescription = productDescription.getTextDescription();
            this.imagelink = productDescription.getImagelink();
        }
    }

    @Data
    static class CreateProductRequest {

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

}
