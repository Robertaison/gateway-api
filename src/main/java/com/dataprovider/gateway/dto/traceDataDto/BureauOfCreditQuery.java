package com.dataprovider.gateway.dto.traceDataDto;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class BureauOfCreditQuery {
  private String name;
  private LocalDateTime date;
}
