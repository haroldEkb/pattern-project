package com.harold.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.Entity;

@Data
@NoArgsConstructor
public class Report {
    private String UserId;
    private String content;
}
