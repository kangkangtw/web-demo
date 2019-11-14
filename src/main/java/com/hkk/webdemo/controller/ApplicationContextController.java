package com.hkk.webdemo.controller;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationContextController implements ApplicationContextAware {

  private ApplicationContext applicationContext;

  @RequestMapping("/applicationContext/name")
  public String getApplicationContextClassName(){
    return applicationContext.getClass().getName();
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.applicationContext = applicationContext;
  }
}
