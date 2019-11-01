package io.javabrains.springbootstarter.repository;

import org.springframework.data.repository.CrudRepository;

import io.javabrains.springbootstarter.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
