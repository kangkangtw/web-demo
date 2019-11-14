package com.hkk.webdemo.controller;

import com.hkk.webdemo.aop.annotation.LogCostTime;
import com.hkk.webdemo.dto.StudentDto;
import com.hkk.webdemo.response.JsonResult;
import com.hkk.webdemo.service.MessageService;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @Autowired
  MessageService messageService;

  @RequestMapping("/logTest")
  @LogCostTime
  public Object logTest(@RequestParam("name") String name) {
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return name;
  }

  @RequestMapping("/message")
  public Object message(@RequestParam("message") String message) {
    return messageService.getMessage(message,message);
  }

  @RequestMapping("/zip")
  public ResponseEntity<JsonResult> zip() {
    JsonResult jsonResult = new JsonResult();
    StudentDto studentDto = new StudentDto();
    studentDto.setAge(1);
    studentDto.setName("hkk");
    jsonResult.setData(studentDto);
    jsonResult.setCode(200);
    return new ResponseEntity<>(jsonResult, HttpStatus.OK);
  }

}
