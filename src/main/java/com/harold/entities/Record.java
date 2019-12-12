package com.harold.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.Entity;
//import javax.persistence.Id;
import java.time.LocalDate;

@Data
@NoArgsConstructor
//@Entity
public class Record {

//    @Id
    private Integer id;

    private Integer userId;
    private String category;
    private String location;
    private Double sum;
    private LocalDate data;
}
