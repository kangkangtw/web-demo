package com.hkk.webdemo.mock;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.List;
import org.junit.Test;
import org.mockito.Mockito;

public class MockTest {

  @Test
  public void verifyBehaviour() {
    //模拟创建一个List对象
    List<Integer> list = mock(List.class);
    //使用mock的对象
    list.add(1);
    list.clear();
    //验证add(1)和clear()行为是否发生
    verify(list).add(1);
    verify(list).clear();

//    Mockito.when(list.get(1)).thenThrow(new RuntimeException());
//// 此时将会抛出RuntimeException
//    System.out.println(list.get(1));
//如果一个函数没有返回值类型，那么可以使用下面的方法模拟异常抛出
//    Mockito.doThrow(new RuntimeException("clear exception")).when(list).clear();
//    list.clear();
    Mockito.when(list.get(anyInt())).thenReturn(1);
// 此时打印是element
    System.out.println(list.get(999));
  }

}
