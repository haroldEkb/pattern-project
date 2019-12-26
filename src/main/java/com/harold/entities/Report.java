package com.harold.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//import javax.persistence.Entity;

@Data
@NoArgsConstructor
public class Report {
    private Integer id;
    private Integer UserId;
    private User User;
    private List<String> content;

    public Report(com.harold.entities.User user, List<String> content) {
        User = user;
        this.content = content;
    }
}
