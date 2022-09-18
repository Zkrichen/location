
package com.residence.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.residence.location.model.Reservation;
@Repository
public interface  ReservationRepository extends JpaRepository<Reservation, Integer> {

	
}
