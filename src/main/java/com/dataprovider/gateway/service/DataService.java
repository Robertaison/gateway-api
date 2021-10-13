package com.dataprovider.gateway.service;

import com.dataprovider.gateway.dto.scoredata.ScoreDataDto;

public interface DataService {
  ScoreDataDto getScoreDataFromCustomer(String cpf);
}
