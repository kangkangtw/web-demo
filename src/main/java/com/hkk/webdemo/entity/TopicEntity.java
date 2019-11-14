package com.hkk.webdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.sql.Timestamp;
import lombok.Data;

@Data
@TableName("topic")
public class TopicEntity {

  @TableId(type = IdType.AUTO)
  private Integer id;
  private String title;
  private String content;
  private String tag;
  private Timestamp inTime;

}
