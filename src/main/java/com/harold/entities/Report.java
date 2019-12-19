package com.harold.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//import javax.persistence.Entity;

@Data
@NoArgsConstructor
public class Report {
    private Integer UserId;
    private List<String> content;
}
