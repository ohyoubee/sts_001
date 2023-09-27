package com.example.sts_001.repository;

import com.example.sts_001.entity.Dept;
import com.example.sts_001.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MyPageRepository extends JpaRepository<Emp, Long> {
    List<Emp> findAll();
}
