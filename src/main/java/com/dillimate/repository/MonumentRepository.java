package com.dillimate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dillimate.entities.Monument;

@Repository
public interface MonumentRepository extends JpaRepository<Monument, Long> {

}
