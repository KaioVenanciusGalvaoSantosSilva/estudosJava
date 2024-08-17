package com.dio.aula.repository;

import com.dio.aula.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> findByNameContaining(String name);

    //Query Override
    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%") //JPQL - sintaxe reconhecida pelo JPA e SQL
    List<User> filtrarPorNome(@Param("name") String name);

    //Query Method
    User findByUsername(String username);

}
