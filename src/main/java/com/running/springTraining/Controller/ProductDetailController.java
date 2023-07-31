package com.running.springTraining.Controller;

import com.running.springTraining.Dto.ProductDetailDto;
import com.running.springTraining.Repository.MainPageRepository;
import com.running.springTraining.domain.Comment;
import com.running.springTraining.domain.Product;
import com.running.springTraining.domain.ProductDescription;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductDetailController {

    private final MainPageRepository mainPageRepository;

    @GetMapping("/api/mapage/{id}")
    public ProductDetailDto productDetailPage(@PathVariable @Valid Long id, ProductDescription productDescription) {

        productDescription detail = mainPageRepository.DetailPage(id);


        return null;
    }






}
