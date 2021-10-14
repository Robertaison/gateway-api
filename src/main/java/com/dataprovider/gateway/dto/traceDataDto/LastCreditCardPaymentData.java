package com.dataprovider.gateway.dto.traceDataDto;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class LastCreditCardPaymentData {
  private String companyName;
  private String amount;
  private String card;
  private String issuerBank;
  private LocalDateTime dateTime;
}
