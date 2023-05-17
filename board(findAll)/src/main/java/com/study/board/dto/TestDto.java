package com.study.board.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TestDto {
    private String testId;
    private String testContents;
    public TestDto(String testId, String testContents) {
        this.testId = testId;
        this.testContents = testContents;
    }
}




