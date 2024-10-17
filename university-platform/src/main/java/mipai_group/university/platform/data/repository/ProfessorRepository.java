package mipai_group.university.platform.data.repository;

import mipai_group.university.platform.data.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
