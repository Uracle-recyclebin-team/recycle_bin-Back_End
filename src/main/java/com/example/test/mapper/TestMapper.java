package com.example.test.mapper;

import com.example.test.domain.TestVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TestMapper {
    List<TestVo> select();
    void insert(TestVo vo);
}
