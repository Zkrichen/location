package com.residence.location.service;

import java.util.List;
import java.util.Optional;

import com.residence.location.model.EquipementAppartement;

public interface AppartementEquipementService {
 public Optional<EquipementAppartement> getAppartement(Integer id);
 void delete(EquipementAppartement appEqui);
EquipementAppartement createOrEditEquipement(EquipementAppartement appartement);
List<EquipementAppartement> getByAppartement(Integer id);
 

}
