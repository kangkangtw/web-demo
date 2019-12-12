package com.hkk.webdemo.mapper;

import com.hkk.webdemo.entity.MockEntity;
import org.springframework.stereotype.Repository;

@Repository
public class MockMapper {

    public MockEntity getById(Long id) {
        MockEntity mockEntity = new MockEntity();
        mockEntity.setName("mockEntity");
        return mockEntity;
    }
}
