package com.aeki.AEKI.models;

import lombok.Data;

import java.util.List;

@Data
public class OrderRequest {
    private String name;
    private Integer customerId;
    private List<ProductRequest> products;
}
