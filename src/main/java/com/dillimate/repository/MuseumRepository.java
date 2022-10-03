package com.dillimate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dillimate.entities.Museum;

@Repository
public interface MuseumRepository extends JpaRepository<Museum, Long>  {

}
