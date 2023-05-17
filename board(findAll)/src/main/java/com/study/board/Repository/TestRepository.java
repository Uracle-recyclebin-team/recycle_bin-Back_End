package com.study.board.Repository;

import com.study.board.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface TestRepository extends JpaRepository<Test, Integer> {
    List<Test> findAll();
}