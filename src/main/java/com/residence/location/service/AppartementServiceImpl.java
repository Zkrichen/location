package com.residence.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.residence.location.model.Appartement;
import com.residence.location.repository.AppartementRepository;
@Component
@Transactional
public class AppartementServiceImpl implements AppartementService {
	@Autowired
	AppartementRepository appRepo;

	@Override
	public List<Appartement> getAll() {
		
		return appRepo.findAll();
	}

	@Override
	public Appartement createOrEditAppartement(Appartement appartement) {
		return appRepo.save(appartement);
	}
	
	@Override
	public Optional<Appartement> getAppartement(Integer id) {
		return appRepo.findById(id);
	}
	
	@Override
	public void delete(Appartement app) {
		 appRepo.delete(app);
	}

}
