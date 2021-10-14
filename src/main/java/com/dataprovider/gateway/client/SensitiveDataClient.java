package com.dataprovider.gateway.client;

import com.dataprovider.gateway.dto.sensitivedata.SensitiveDataDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "sensitivedata-api", url = "http://localhost:8083/")
public interface SensitiveDataClient {

  @RequestMapping(method = RequestMethod.GET, value = "/sensitive-data")
  SensitiveDataDto getSensitiveDataFromCustomer(@RequestParam String cpf);
}