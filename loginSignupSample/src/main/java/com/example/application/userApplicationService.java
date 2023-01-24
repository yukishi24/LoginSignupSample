package com.example.application;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class userApplicationService {
  public Map<String, Integer> getGenderMap() {
    Map<String, Integer> map = new LinkedHashMap<>();
    map.put("男性", 1);
    map.put("女性", 2);
    return map;
  }
}
