package com.dillimate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dillimate.entities.Guide;

@Repository
public interface GuideRepository extends JpaRepository<Guide, Long>  {

}
