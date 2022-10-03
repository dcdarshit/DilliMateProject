package com.dillimate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dillimate.entities.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
