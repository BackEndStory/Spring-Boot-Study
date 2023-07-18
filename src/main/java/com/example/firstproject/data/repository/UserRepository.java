package com.example.firstproject.data.repository;

import com.example.firstproject.data.entiity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User getByUid(String uid);

}
