package mipai_group.university.platform.data.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@DiscriminatorValue("Student")
public class Student extends User {
    private Long studentId;
    private Integer semester;
    private String State; //class state
    private float average;
    private Integer creditNumber;
    //to identify relationship
    private Career career;
    //to identify relationship
    private List<String> courses; //class courses


}
