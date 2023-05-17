package com.study.board.Service;

import com.study.board.Repository.TestRepository;
import com.study.board.dto.TestDto;
import com.study.board.entity.Test;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;


    public List<Test> getAllTests() {
        return testRepository.findAll();
    }

}