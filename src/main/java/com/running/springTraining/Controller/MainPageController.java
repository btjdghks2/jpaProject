package com.running.springTraining.Controller;

import com.running.springTraining.Dto.Main.MainListDto;
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

    private final MainPageService mainPageService;




    // 메인페이지 목록 출력
    @GetMapping("/api/main")
    public List<MainListDto> MainPageList(@RequestBody @Valid MainListDto mainListDto) {


    return mainPageService.MainProductList();

    }



}
