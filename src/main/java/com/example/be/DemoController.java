package com.example.be;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final DemoRepository demoRepository;


    @PostMapping("/user")
    public void saveUsers() {
        demoRepository.save(new AppUser("b"));
    }

    @GetMapping("/userInfo")
    public String getUserName() {
        return demoRepository.findAll().get(1  ).getClass().getName();
    }
}
