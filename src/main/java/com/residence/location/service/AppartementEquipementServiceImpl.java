package com.residence.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.residence.location.model.EquipementAppartement;
import com.residence.location.repository.EquipementRepository;
@Component
@Transactional
public class AppartementEquipementServiceImpl implements AppartementEquipementService {
	@Autowired
	EquipementRepository appRepo;

	@Override
	public List<EquipementAppartement> getByAppartement(Integer id) {
		
		return appRepo.findByAppartement(id);
	}

	@Override
	public EquipementAppartement createOrEditEquipement(EquipementAppartement appartement) {
		return appRepo.save(appartement);
	}
	
	@Override
	public Optional<EquipementAppartement> getAppartement(Integer id) {
		return appRepo.findById(id);
	}
	
	@Override
	public void delete(EquipementAppartement app) {
		 appRepo.delete(app);
	}

}
