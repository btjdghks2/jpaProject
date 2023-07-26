package com.running.springTraining.Service;

import com.running.springTraining.Repository.MainPageRepository;
import com.running.springTraining.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MainPageService {

    private final MainPageRepository mainPageRepository;

    public List<CreateMainRequest> MainList() {
        List<Product> products = mainPageRepository.findAll();
        List<CreateMainRequest> CreateMainRequests = new ArrayList<>();

        for(Product product : products) {
            CreateMainRequests.add(new CreateMainRequest(product));
        }
        return CreateMainRequests;

    }

}
