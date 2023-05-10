package com.example.test.controller;

import com.example.test.domain.TestVo;
import com.example.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("select")
    public List<TestVo> getSelectList(){
        return  testService.select();
    }

    @PostMapping("insert")
    public void  insertTestVo(@RequestBody TestVo vo){
        testService.insert(vo);
    }

}
