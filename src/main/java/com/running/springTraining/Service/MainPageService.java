package com.running.springTraining.Service;

import com.running.springTraining.Repository.MainPageRepository;
import com.running.springTraining.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class MainPageService {

    private final MainPageRepository mainPageRepository;


    public List<Product> MainProductList() {
        return mainPageRepository.MainList();

    }

}
