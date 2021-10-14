package com.dataprovider.gateway.resource;

import com.dataprovider.gateway.dto.scoredata.ScoreDataDto;
import com.dataprovider.gateway.dto.sensitivedata.SensitiveDataDto;
import com.dataprovider.gateway.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataResource {

  @Autowired
  private DataService dataService;

  @GetMapping(value = "/score-data")
  public ResponseEntity<ScoreDataDto> getScoreDataFromCustomer(@RequestParam String cpf) {
    return ResponseEntity.ok(dataService.getScoreDataFromCustomer(cpf));
  }

  @GetMapping(value = "/sensitive-data")
  public ResponseEntity<SensitiveDataDto> getSensitiveDataFromCustomer(@RequestParam String cpf) {
    return ResponseEntity.ok(dataService.getSensitiveDataFromCustomer(cpf));
  }
}
