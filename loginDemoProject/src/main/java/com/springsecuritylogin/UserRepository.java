package com.springsecuritylogin;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springsecuritylogin.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User>findByUserName(String userName);
}
