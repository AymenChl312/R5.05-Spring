package fr.aymen.tp_spring.Article.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.aymen.tp_spring.Article.Model.User;


public interface UserRepository extends JpaRepository<User, Long> {}

