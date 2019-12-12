package com.hkk.webdemo.service;

import com.hkk.webdemo.entity.MockEntity;
import com.hkk.webdemo.mapper.MockMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MockService {
    @Autowired
    private MockMapper mockMapper;

    public MockEntity getById(Long id){
        return mockMapper.getById(id);
    }

}
