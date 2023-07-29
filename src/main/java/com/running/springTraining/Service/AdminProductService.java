package com.running.springTraining.Service;

import com.running.springTraining.Repository.MainPageRepository;
import com.running.springTraining.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminProductService {

    private final MainPageRepository mainPageRepository;

    public Long join(Product product) {

        mainPageRepository.save(product.getId());

        return product.getId();


    }

    public Long update(Product product) {
        mainPageRepository.findbyitem(product.getId());
        mainPageRepository.save(product.getId());
        return product.getId();
    }

}
