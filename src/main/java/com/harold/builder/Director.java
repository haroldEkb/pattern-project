package com.harold.builder;

import com.harold.entities.User;

import java.time.LocalDate;

public class Director {
    private RecordBuilder recordBuilder;

    //Default settings, temp solution
    private User user = new User(1, "John");
    private LocalDate localDate = LocalDate.now();
    private String category = "Food";
    private String location = "Magnit";
    private Double sum = 20.50;

    public void addRecord(String mode) {
        if (mode.equals("default")){
            recordBuilder.reset()
                    .setUserId(user.getId())
                    .setCategory(category)
                    .setLocation(location)
                    .setData(localDate)
                    .setSum(sum);
        }
    }

    public Director(RecordBuilder recordBuilder) {
        this.recordBuilder = recordBuilder;
    }
}
