package com.kodbooks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository 
		extends 
		JpaRepository<Post, Long> {

}
