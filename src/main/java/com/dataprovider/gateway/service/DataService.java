package com.dataprovider.gateway.service;

import com.dataprovider.gateway.dto.scoredata.ScoreDataDto;
import com.dataprovider.gateway.dto.sensitivedata.SensitiveDataDto;
import com.dataprovider.gateway.dto.traceDataDto.TraceDataDto;

public interface DataService {
  ScoreDataDto getScoreDataFromCustomer(String cpf);
  SensitiveDataDto getSensitiveDataFromCustomer(String cpf);
  TraceDataDto getTraceDataFromCustomer(String cpf);
}
