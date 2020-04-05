package bdd.demo.genapp.repository;

import bdd.demo.genapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, String> {
    User findByEmail(@Param("email") String email);
}
