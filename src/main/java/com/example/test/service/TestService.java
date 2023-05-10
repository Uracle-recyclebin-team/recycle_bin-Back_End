package com.example.test.service;

import com.example.test.domain.TestVo;
import com.example.test.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TestService {
    @Autowired
    private TestMapper mapper;

    public List<TestVo> select(){
        return mapper.select();
    }
    public  void insert(TestVo vo){
        mapper.insert(vo);
    }
}
