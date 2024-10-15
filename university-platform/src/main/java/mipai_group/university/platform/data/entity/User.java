package mipai_group.university.platform.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dni;
    private String name;
    private String lastName;
    private String email;
    private String userName;
    private String password;
    private String phoneNumber;
    private String city;
    private int semester;

    //private Careers career;
    //private <List> courses;
    //private History academicHistory;
    //private float mean;
    //private int credits;
    //possible changes...
}
