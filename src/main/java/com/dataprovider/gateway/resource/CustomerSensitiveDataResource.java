package com.dataprovider.gateway.resource;

import com.dataprovider.gateway.client.SensitiveDataClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerSensitiveDataResource {

  @Autowired
  SensitiveDataClient sensitiveDataClient;

  @GetMapping
  public ResponseEntity<String> getSensitiveData() {
    return ResponseEntity.ok(sensitiveDataClient.get());
  }
}
