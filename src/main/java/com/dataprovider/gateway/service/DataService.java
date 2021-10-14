package com.dataprovider.gateway.service;

import com.dataprovider.gateway.dto.scoredata.ScoreDataDto;
import com.dataprovider.gateway.dto.sensitivedata.SensitiveDataDto;

public interface DataService {
  ScoreDataDto getScoreDataFromCustomer(String cpf);
  SensitiveDataDto getSensitiveDataFromCustomer(String cpf);
}
