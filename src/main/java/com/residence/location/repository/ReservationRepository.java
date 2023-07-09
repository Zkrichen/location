
package com.residence.location.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.residence.location.model.Reservation;
@Repository
public interface  ReservationRepository extends JpaRepository<Reservation, Integer> {

	   @Query("select a from reservation a where a.datedebut = :today")
	    List<Reservation> findCheckIN( @Param("today") Date creationDateTime);
	   
	   @Query("select a from reservation a where a.datefin = :today")
	    List<Reservation> findCheckOUT( @Param("today") Date creationDateTime);
	   
	   @Query("select a from reservation a where a.datedebut<: datedebut  or  a.datefin>: datefin and appratement=: appar")
	    List<Reservation> findIfExestingRes( @Param("datedebut") Date datedebut, @Param("datefin") Date datefin, @Param("appar") Long appar );
}
