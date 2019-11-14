package com.hkk.webdemo.utils;

import org.dozer.DozerBeanMapper;

public class BeanUtils {

  private static final DozerBeanMapper mapper = new DozerBeanMapper();

  public static void copy(Object source, Object target) {
    mapper.map(source, target);
  }
}
