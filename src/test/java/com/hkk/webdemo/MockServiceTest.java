package com.hkk.webdemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.hkk.webdemo.entity.MockEntity;
import com.hkk.webdemo.mapper.MockMapper;
import com.hkk.webdemo.service.MockService;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MockServiceTest {

    // @Mock 没有stub则返回默认值，如null，0
    // @Spy 没有stub则执行对象的原始方法
    // @InjectMocks @Mock注解的对象会被注入到被@InjectMocks注解的对象里面
    // @MockBean 是Spring提供的注解，被该注解标注的类会替换Spring容器相同name的Bean，并被Spring管理
    @Mock
    private MockMapper mockMapper;
    @InjectMocks
    private MockService mockService;

    public MockServiceTest() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void test() {
        MockEntity mockEntity = mock(MockEntity.class);
        when(mockEntity.getName()).thenReturn("mockEntity");
        when(mockMapper.getById(anyLong())).thenReturn(mockEntity);
        MockEntity result = mockService.getById(anyLong());
        assertNotNull(result);
        assertEquals("mockEntity", result.getName());
    }


}
