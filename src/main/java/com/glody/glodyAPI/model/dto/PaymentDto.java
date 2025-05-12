package com.glody.glodyAPI.model.dto;

import lombok.Data;

@Data
public class PaymentDto {
    Integer userId; Integer applicationId; String currencyCode; String paymentMethod; String status; String transactionId; 
}