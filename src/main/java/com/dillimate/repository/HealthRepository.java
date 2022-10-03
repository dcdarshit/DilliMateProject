package com.dillimate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dillimate.entities.Clinic;

@Repository
public interface HealthRepository extends JpaRepository<Clinic, Long> {

}
