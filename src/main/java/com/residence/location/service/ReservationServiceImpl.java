package com.residence.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.residence.location.model.Reservation;
import com.residence.location.repository.ReservationRepository;
@Component
@Transactional
public class ReservationServiceImpl implements ReservationService{

	@Autowired
	ReservationRepository resRepo;
	@Override
	public List<Reservation> getAll() {
		return resRepo.findAll();

	}

	@Override
	public Reservation createOrEditRes(Reservation res) {
		return resRepo.save(res);

	}

	@Override
	public Optional<Reservation> getRes(Integer id) {
		return resRepo.findById(id);
	}

	@Override
	public void delete(Reservation reservation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Reservation> findAll(Sort by) {
		// TODO Auto-generated method stub
		return resRepo.findAll(by);
		}

}
