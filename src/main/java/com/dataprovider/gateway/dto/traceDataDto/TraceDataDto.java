package com.dataprovider.gateway.dto.traceDataDto;

import java.util.List;
import lombok.Data;

@Data
public class TraceDataDto {

  private String cpf;
  private BureauOfCreditQuery lastQueryAtBureauOfCredit;
  private List<FinancialMovement> financialMovementList;
  private LastCreditCardPaymentData lastCreditCardPaymentData;
  private String updatedAt;
}
