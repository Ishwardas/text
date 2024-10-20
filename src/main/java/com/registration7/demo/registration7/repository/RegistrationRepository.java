package com.registration7.demo.registration7.repository;

import com.registration7.demo.registration7.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}