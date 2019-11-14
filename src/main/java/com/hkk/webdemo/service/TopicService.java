package com.hkk.webdemo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hkk.webdemo.dto.TopicDto;
import com.hkk.webdemo.mapper.TopicMapper;
import java.util.List;

import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

  @Autowired
  private TopicMapper topicMapper;

  public List<TopicDto> list() {
    return topicMapper.selectList(new QueryWrapper<>()).stream().map(TopicDto::fromEntity).collect(
        Collectors.toList());
  }

}
