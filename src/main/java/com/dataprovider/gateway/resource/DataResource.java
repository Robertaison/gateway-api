package com.dataprovider.gateway.resource;

import com.dataprovider.gateway.client.ScoreDataClient;
import com.dataprovider.gateway.client.SensitiveDataClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataResource {

  @Autowired
  ScoreDataClient scoreDataClient;

  @GetMapping(value = "/score-data", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<String> getScoreDataFromCustomer(@RequestParam String cpf) {
    return ResponseEntity.ok(scoreDataClient.get(cpf));
  }
}
