package com.dataprovider.gateway.client;

import com.dataprovider.gateway.dto.sensitivedata.SensitiveDataDto;
import com.dataprovider.gateway.dto.traceDataDto.TraceDataDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "tracedata-api", url = "http://localhost:8082/")
public interface TraceDataClient {

  @RequestMapping(method = RequestMethod.GET, value = "/trace-data")
  TraceDataDto getTraceDataFromCustomer(@RequestParam String cpf);
}
