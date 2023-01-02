package com.residence.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.residence.location.model.Appartement;

public interface AppartementRepository extends JpaRepository<Appartement, Integer> {

	
}
