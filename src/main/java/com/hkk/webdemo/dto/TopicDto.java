package com.hkk.webdemo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hkk.webdemo.entity.TopicEntity;
import com.hkk.webdemo.utils.BeanUtils;
import java.sql.Timestamp;
import lombok.Data;

@Data
public class TopicDto {

  private long topicId;
  private String title;
  private String content;
  private String tag;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Timestamp inTime;

  public static TopicDto fromEntity(TopicEntity topicEntity) {
    TopicDto topicDto = new TopicDto();
    topicDto.setTopicId(topicEntity.getId());
    BeanUtils.copy(topicEntity, topicDto);
    return topicDto;
  }
}
