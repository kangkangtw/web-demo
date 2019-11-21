package com.hkk.webdemo.controller;

import com.hkk.webdemo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

  @Autowired
  private TopicService topicService;

  @RequestMapping("/")
  public Object list() {
    return "Hello World";
//    return topicService.list();
  }

}
