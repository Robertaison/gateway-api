package com.dataprovider.gateway.service.impl;

import com.dataprovider.gateway.client.ScoreDataClient;
import com.dataprovider.gateway.client.SensitiveDataClient;
import com.dataprovider.gateway.dto.scoredata.ScoreDataDto;
import com.dataprovider.gateway.dto.sensitivedata.SensitiveDataDto;
import com.dataprovider.gateway.service.DataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DataServiceImpl implements DataService {

  @Autowired
  private ScoreDataClient scoreDataClient;

  @Autowired
  private SensitiveDataClient sensitiveDataClient;

  @Override
  public ScoreDataDto getScoreDataFromCustomer(String cpf) {
    return scoreDataClient.get(cpf);
  }

  @Override
  public SensitiveDataDto getSensitiveDataFromCustomer(String cpf) {
    return sensitiveDataClient.getSensitiveDataFromCustomer(cpf);
  }
}
