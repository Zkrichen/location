package com.residence.location.service;

import java.util.List;
import java.util.Optional;

import com.residence.location.model.Appartement;

public interface AppartementService {
 public List<Appartement> getAll();
 public Appartement createOrEditAppartement(Appartement client);
 public Optional<Appartement> getAppartement(Integer id);
 void delete(Appartement client);
 

}
