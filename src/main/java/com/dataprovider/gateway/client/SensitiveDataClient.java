package com.dataprovider.gateway.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "datascore-api", url = "http://localhost:8081/")
public interface SensitiveDataClient {

  @RequestMapping(method = RequestMethod.GET, value = "/data")
  String get();

}