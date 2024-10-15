package mipai_group.university.platform.data.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Career {
    private Long id;
    private String code;
    private String name;
    private String description;
    private Integer totalCredits;
    private String semesters;
    //to identify relationship
    private List<String> coursesAgg; // logic for the content

}
