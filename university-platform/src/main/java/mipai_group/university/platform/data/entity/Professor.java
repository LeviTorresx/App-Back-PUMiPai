package mipai_group.university.platform.data.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Entity
@AllArgsConstructor
@Data
public class Professor extends User {

    private Long professorId;
    //to identify relationship
    private List<String> coursesAgg;
    private String academicTittle;

}
