package com.java.consumer.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.consumer.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByLastname(String lastname);

	void delete(User entity);

}
