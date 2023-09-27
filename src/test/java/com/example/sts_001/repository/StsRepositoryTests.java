package com.example.sts_001.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StsRepositoryTests {

    @Autowired
    StsRepository stsRepository;

    @Test
    public void testClass() {
        System.out.println(stsRepository.getClass().getName());
    }

}
