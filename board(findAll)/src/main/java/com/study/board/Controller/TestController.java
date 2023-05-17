package com.study.board.Controller;

import com.study.board.Service.TestService;
import com.study.board.dto.TestDto;
import com.study.board.entity.Test;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {
    private final TestService testService;

    @GetMapping("/all")
    public List<Test> getAllTests() {
        return testService.getAllTests();
    }
}