package com.running.springTraining.Service;

import com.running.springTraining.Dto.Main.MainListDto;
import com.running.springTraining.Repository.MainPageRepository;
import com.running.springTraining.domain.Product;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class MainPageService {

    private final MainPageRepository mainPageRepository;
    private final MainPageService mainPageService;


    public List<MainListDto> MainProductList() {

        List<Product> productList = mainPageRepository.findAll();
        List<MainListDto> mainListDto = productList.stream()
                .map(p -> new MainListDto(p))
                .collect(Collectors.toList());

        return mainListDto;



    }





}
