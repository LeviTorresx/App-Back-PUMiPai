package mipai_group.university.platform.data.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Course {
    private Long courseId;
    private String code;
    private String name;
    private String description;
    private Integer credits;
    private List<String> contents; //class documents to courses
    private Date startDate;
    private Date endDate;
    // to identify relationship
    private Professor assignedTeacher;

}
