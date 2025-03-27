package com.example.git;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/scenario5")
public class Scenario5RenamedFile {

    @GetMapping
    public ResponseEntity<Integer> scenario5Update() {

        return ResponseEntity.ok(5);
    }
}
