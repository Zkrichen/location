package com.residence.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;

import com.residence.location.model.Reservation;

public interface ReservationService {
 public List<Reservation> getAll();
 public Reservation createOrEditRes(Reservation res);
 public Optional<Reservation> getClient(Integer id);
 void delete(Reservation reservation);
public List<Reservation> findAll(Sort by);
 

}
