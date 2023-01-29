package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;
import lombok.Data;

@Repository
@Configuration
@ConfigurationProperties(prefix = "signup")
@PropertySource(value = "classpath:message.yml" , factory = YamlPropertySourceFactory.class)
@Data
public class messageConfig {
  private String title;
  private String btn;
  private String userId;
  private String userName;
  private String birthday;
  private String meal;
  private String female;
  
}
