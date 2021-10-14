package com.dataprovider.gateway.dto.sensitivedata;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DebtDto {

  private String creditorName;
  private String creditorDocument;
  private String currentDebitAmount;
  private String initialDebitAmount;
  private String initialData;
}
