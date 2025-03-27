package com.example.git;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/scenario3")
public class Scenario3Controller {

    @GetMapping("/update")
    public ResponseEntity<String> update() {

        return ResponseEntity.ok("A 브랜치에서는 수정");
    }

    @GetMapping("/delete")
    public ResponseEntity<String> delete() {

        return ResponseEntity.ok("B 브랜치에서는 삭제");
    }
}
