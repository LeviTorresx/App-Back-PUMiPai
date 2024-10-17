package mipai_group.university.platform.data.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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

    private State State;

    private float average;

    private Integer creditNumber;

    @ManyToOne
    private Career career;

    @ManyToMany
    private List<Course> courses;
}
