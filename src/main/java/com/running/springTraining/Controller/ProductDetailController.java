package com.running.springTraining.Controller;

import com.running.springTraining.Dto.AdminDto.ProductDetailDto;
import com.running.springTraining.Repository.MainPageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class ProductDetailController {

    private final MainPageRepository mainPageRepository;

    @GetMapping("/api/mapage/{id}")
    public ProductDetailDto productDetailPage(@PathVariable @Valid Long id) {



        return null;
    }






}
