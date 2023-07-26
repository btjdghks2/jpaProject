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
    public Result mainpage() {

        List<Product> MainAll = mainPageService.MainList();
        List<ProductDto> collect = MainList.steam()
                .map(m -> new ProductDto(m.getId,m.getName,m.getPrice()))
                .collect(Collectors.toList());




        //기본적으로 이것은 조회하는 아이피다, 그러므로 처음 들어오면(요청request) responsebody를 사용하는게 우선인것이다 메인페이지에 노출해야 할 것은
        // 상품이름, 가격, 상품이미지 3가지 이다

    }

    @Data
    @AllArgsConstructor
    static class Result<T> {
        private T data;

    }

    @Data
    @AllArgsConstructor
    static class ProductDto {
        private Long id;
        private String name;
        private int price;
    }
}
