package com.residence.location.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class ReservationServiceImpl implements ReservationService {

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
		return resRepo.findAll(by);
	}

	@Override
	public List<Reservation> getCheckOUT() {
		Date date = new Date();
		SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-dd");
		String stringDate= DateFor.format(date);
	    Date date1;
		try {
			date1 = new SimpleDateFormat("yyyy-MM-dd").parse(stringDate);
			return resRepo.findCheckOUT(date1);

		} catch (ParseException e) {
			e.printStackTrace();
		}  
		return null;

	}

	@Override
	public List<Reservation> getCheckIN() {
		
		Date date = new Date();
		SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-dd");
		String stringDate= DateFor.format(date);
	    Date date1;
		try {
			date1 = new SimpleDateFormat("yyyy-MM-dd").parse(stringDate);
			return resRepo.findCheckIN(date1);

		} catch (ParseException e) {
			e.printStackTrace();
		}  
		return null;
	}

}
