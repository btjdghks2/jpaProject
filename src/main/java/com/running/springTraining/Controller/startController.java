package com.running.springTraining.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class startController {

    @GetMapping("/")
    public String home() {
        return "startV2";
    }

    // 만들어야 할 기능
    // 로그인을 해서
    // 물건 목록을 좌라락 보여주고 - findall
    // 물건의 클릭하면 상세 페이지로 가서 - findbyid 단건 조회
    // 구매버튼을 누르면 주문 목록에 물건을 추가하는 기능 - 주문 목록에 추가
    // 구매후기 리뷰도 쓰기 - 댓글 기능
    //
}
