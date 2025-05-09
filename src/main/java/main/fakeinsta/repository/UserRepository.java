package main.fakeinsta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import main.fakeinsta.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value="SELECT * FROM users WHERE users.id = :id", nativeQuery=true)
    User pegarUm(@Param("id") int id);
}
