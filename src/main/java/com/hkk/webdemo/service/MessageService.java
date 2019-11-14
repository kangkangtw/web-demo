package com.hkk.webdemo.service;

import java.util.Locale;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Service;

@Service
public class MessageService implements MessageSourceAware {

  private MessageSource messageSource;

  public String getMessage(String code) {
    return messageSource.getMessage(code, null, Locale.getDefault());
  }

  public String getMessage(String code, Object... args) {
    return messageSource.getMessage(code, args, Locale.getDefault());
  }

  public String getMessage(String code, Locale locale, Object... args) {
    return messageSource.getMessage(code, args, locale);
  }

  @Override
  public void setMessageSource(MessageSource messageSource) {
    this.messageSource = messageSource;
  }
}
