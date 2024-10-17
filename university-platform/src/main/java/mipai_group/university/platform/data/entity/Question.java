package mipai_group.university.platform.data.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;

import java.util.List;

public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private float assessment;

    private QuestionType questionsType;

    @ManyToAny // not def
    private List<Option> option;

    private String answer;

}
