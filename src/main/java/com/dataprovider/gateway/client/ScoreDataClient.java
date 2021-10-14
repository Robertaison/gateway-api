package com.dataprovider.gateway.client;

import com.dataprovider.gateway.dto.scoredata.ScoreDataDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "datascore-api", url = "http://localhost:8081/")
public interface ScoreDataClient {

  @RequestMapping(method = RequestMethod.GET, value = "/score-data")
  ScoreDataDto getScoreDataFromCustomer(@RequestParam String cpf);
}
