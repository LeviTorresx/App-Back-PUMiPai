package mipai_group.university.platform.data.entity;

import jakarta.persistence.*;
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String name;

    private String description;

    private Integer credits;

    private Date startDate;

    private Date endDate;

    @OneToOne
    private Professor assignedTeacher;

    @ManyToOne
    private List<Task> tasks;

}
