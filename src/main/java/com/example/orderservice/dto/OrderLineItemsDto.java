package com.example.orderservice.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderLineItemsDto {

    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer Qunatity;
}
