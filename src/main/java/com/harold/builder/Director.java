package com.harold.builder;

import com.harold.entities.Record;
import com.harold.entities.User;
import com.harold.utils.SimpleRecord;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
public class Director {
    private RecordBuilder recordBuilder;

    //Default settings, temp solution
    private User user = new User(1, "John");
    private LocalDate localDate = LocalDate.now();
    private String category = "Food";
    private String location = "Magnit";
    private Double sum = 20.50;

    public void addRecord(String mode) {
        if (mode.equals("mock")){
            recordBuilder.reset()
                    .setUserId(user.getId())
                    .setCategory(category)
                    .setLocation(location)
                    .setData(localDate)
                    .setSum(sum);
        }
    }

    public void addRecord(SimpleRecord record, String mode) {
        if (record != null){
            if (mode.equals("default")){
                recordBuilder.reset()
                        .setUserId(record.getUserId())
                        .setCategory(record.getCategory())
                        .setLocation(record.getLocation())
                        .setData(record.getData())
                        .setSum(record.getSum());
            }
        }
    }

    public Director(RecordBuilder recordBuilder) {
        this.recordBuilder = recordBuilder;
    }

    public void setRecordBuilder(RecordBuilder recordBuilder) {
        this.recordBuilder = recordBuilder;
    }

    public boolean isBuilderAssigned(){
        return recordBuilder != null;
    }

    public Record getResult(){
        return recordBuilder.getResult();
    }
}
