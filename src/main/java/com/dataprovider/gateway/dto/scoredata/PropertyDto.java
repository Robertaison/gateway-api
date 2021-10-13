package com.dataprovider.gateway.dto.scoredata;

import lombok.Builder;
import lombok.Data;

@Data
public class PropertyDto {

  private String propertyName;
  private String propertyDocument;
  private String propertyEvaluatedPrice;
}
