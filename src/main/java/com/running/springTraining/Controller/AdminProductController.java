package com.running.springTraining.Controller;

import com.running.springTraining.Dto.CreateProductRequest;
import com.running.springTraining.Dto.CreateProductResponse;
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
        return null;

    }







}
