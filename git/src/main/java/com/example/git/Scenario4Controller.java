package com.example.git;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/scenario4")
public class Scenario4Controller {

    @GetMapping
    public ResponseEntity<Integer> scenario4Update() {

        // b 브랜치에서 수정하기

        return ResponseEntity.ok(5);
    }
}
