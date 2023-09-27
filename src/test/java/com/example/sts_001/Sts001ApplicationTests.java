package com.example.sts_001;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@SpringBootTest
class StsApplicationTests {
    @PersistenceContext
    EntityManager em;
    @Autowired
    StsRepository stsRepository;

    @Test
    public void list_StsEntity() {
        Pageable pageable = PageRequest.of(0, 10, Sort.by("id").descending());
        Page<Object[]> list = stsRepository.getListWithQueryObject(0L, pageable);
        for (Object[] objects : list) {
            for (Object object : objects) {
                System.out.println(object);
            }
        }
    }

}
