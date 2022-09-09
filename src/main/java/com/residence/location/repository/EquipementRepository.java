package com.residence.location.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.residence.location.model.EquipementAppartement;

public interface EquipementRepository extends JpaRepository<EquipementAppartement, Integer> {

	List<EquipementAppartement> findByAppartement(Integer id);
}
