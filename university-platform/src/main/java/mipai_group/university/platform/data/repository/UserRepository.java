package mipai_group.university.platform.data.repository;

import mipai_group.university.platform.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
