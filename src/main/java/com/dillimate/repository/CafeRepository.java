package com.dillimate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dillimate.entities.Cafe;

@Repository
public interface CafeRepository extends JpaRepository<Cafe, Long> {

}
