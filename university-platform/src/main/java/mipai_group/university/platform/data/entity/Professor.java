package mipai_group.university.platform.data.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Entity
@AllArgsConstructor
@Data
@DiscriminatorValue("Professor")
public class Professor extends User {

    private Long professorId;

    @ManyToMany
    private List<String> coursesAgg;

    private String academicTittle;

    private Integer experienceTime;

}
