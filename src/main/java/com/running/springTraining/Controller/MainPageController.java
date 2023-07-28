package com.running.springTraining.Controller;

import com.running.springTraining.Repository.MainPageRepository;
import com.running.springTraining.Service.MainPageService;
import com.running.springTraining.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class MainPageController {

    private final MainPageRepository mainPageRepository;
    private final MainPageService mainPageService;



    // 메인페이지 목록 출력
    @GetMapping("/api/mainpage/")
    public List<ProductListDto> mainpage() {

        List<Product> products = mainPageRepository.MainList();
        List<ProductListDto> result = products.stream()
                .map(p -> new ProductListDto(p))
                .collect(Collectors.toList());

        return result;


    }

    @Data
    static class ProductListDto {
        private Long id;
        private String name;
        private int price;

        public ProductListDto(Product product) {
            this.id = product.getId();
            this.name = product.getName();
            this.price = product.getPrice();
        }
    }

}
