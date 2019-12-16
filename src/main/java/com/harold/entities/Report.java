package com.harold.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.Entity;

@Data
@NoArgsConstructor
public class Report {
    private Integer id;
    private User User;
    private String content;

    public Report(com.harold.entities.User user, String content) {
        User = user;
        this.content = content;
    }
}
