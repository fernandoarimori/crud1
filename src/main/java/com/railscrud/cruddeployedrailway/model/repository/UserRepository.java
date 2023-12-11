package com.railscrud.cruddeployedrailway.model.repository;

import com.railscrud.cruddeployedrailway.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
