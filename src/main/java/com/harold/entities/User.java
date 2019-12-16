package com.harold.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.Entity;
//import javax.persistence.Id;
import java.util.List;

@Data
@NoArgsConstructor
//@Entity
public class User {
//    @Id
    private Integer id;

    private String name;
    private String password;
    private String email;
    private String phone;
    private List<Record> records;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
