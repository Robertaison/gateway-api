package com.dataprovider.gateway.dto.sensitivedata;

import java.util.Set;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SensitiveDataDto {

  private String cpf;
  private String customerName;
  private String address;
  private Set<DebtDto> debts;
  private String updatedAt;
}

