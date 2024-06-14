package jpaexemplo.aula7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jpaexemplo.aula7.model.User;



public interface  UserRepository extends JpaRepository<User, Integer>{

}
