package com.harold.utils;

import lombok.Data;

import java.time.LocalDate;

@Data
public class SimpleRecord {
    private Integer userId;
    private String category;
    private String location;
    private Double sum;
    private LocalDate data;
}
