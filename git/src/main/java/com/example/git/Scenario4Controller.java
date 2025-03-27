package com.example.git;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/scenario4")
public class Scenario4Controller {

    @GetMapping("/update")
    public ResponseEntity<String> update() {

        return ResponseEntity.ok("scenario3 A 브랜치는 수정을 진행");
    }
}
