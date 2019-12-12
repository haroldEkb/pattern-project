package com.harold.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class User {
    private String name;
    private String password;
    private Integer id;
    private String email;
    private List<Record> records;
}
