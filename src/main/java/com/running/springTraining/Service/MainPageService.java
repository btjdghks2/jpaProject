package com.running.springTraining.Service;

import com.running.springTraining.Repository.MainPageRepository;
import com.running.springTraining.domain.Product;
import lombok.Data;
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

    @Data
    static class dtotest {

        private Long testid;
        private int testid2;
        private String testText;

        public dtotest(Long testid, int testid2, String testText) {
            this.testid = testid;
            this.testid2 = testid2;
            this.testText = testText;
        }
    }



}
