package com.example.git;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/scenario4")
public class Scenario4RenamedController {

    @GetMapping
    public ResponseEntity<String> scenario4() {

        return ResponseEntity.ok("scenario4 base");
    }
}
