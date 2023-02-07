package com.jacksawyer.authentication.services;
import org.springframework.data.repository.CrudRepository;
import org.apache.catalina.User;

public interface UserRepository extends CrudRepository<User, Long>{

	public static User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
}