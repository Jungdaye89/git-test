package com.example.git;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/test")
public class TestController {

    @GetMapping("/base")
    public ResponseEntity<String> base() {

        return ResponseEntity.ok("git 충돌 연습하기");
    }

    @GetMapping("/scenario2")
    public ResponseEntity<String> scenario2() {

        System.out.println("깃 충돌(a 브랜치)");
        System.out.println("연습 중입니다");

        return ResponseEntity.ok("같은 파일에서 다른 줄 수정할 때 충돌");
    }
}
