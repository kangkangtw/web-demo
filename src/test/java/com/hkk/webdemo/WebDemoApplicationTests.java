package com.hkk.webdemo;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebDemoApplicationTests {

  @Test
  public void contextLoads() {
  }

  @Test
  public void verifyBehaviour(){
    //模拟创建一个List对象
    List<Integer> mock = mock(List.class);
    //使用mock的对象
    mock.add(1);
    mock.clear();
    //验证add(1)和clear()行为是否发生
    verify(mock).add(1);
    verify(mock).clear();
  }

}
