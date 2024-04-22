package com.sejal.code.fullstackbackend.repository;

import com.sejal.code.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
