package com.dataprovider.gateway.dto.traceDataDto;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class FinancialMovement {

  private String amount;
  private String type;
  private LocalDateTime dateTime;
}
