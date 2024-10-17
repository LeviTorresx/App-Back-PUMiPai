package mipai_group.university.platform.data.repository;

import mipai_group.university.platform.data.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
