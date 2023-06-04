package com.residence.location.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.residence.location.model.EquipementAppartement;
import com.residence.location.service.AppartementEquipementService;

@RestController
@RequestMapping("/equipements")
public class EquipementController {
@Autowired
public AppartementEquipementService equipementService;
	    
	    @GetMapping("/{id}")
	    public  List<EquipementAppartement>getAppartementById(@PathVariable("id") Integer id) {
	       List<EquipementAppartement> equipementApp = equipementService.getByAppartement(id);

	     return equipementApp;
	    }
	    
	    @PostMapping("/")
	    public ResponseEntity<EquipementAppartement> createAppartement(@RequestBody EquipementAppartement app) {
	      try {
	    	  EquipementAppartement _app = equipementService.createOrEditEquipement(app);
	        return new ResponseEntity<>(_app, HttpStatus.CREATED);
	      } catch (Exception e) {
	        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	      }
	    }

	    @PutMapping()
	    public ResponseEntity<EquipementAppartement> updateAppartement(@RequestBody EquipementAppartement appartement) {

	      if (appartement!=null) {
	       
	        return new ResponseEntity<>(equipementService.createOrEditEquipement(appartement), HttpStatus.OK);
	      } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	      }
	    }
	    
	    @DeleteMapping()
	    public void delete(@RequestBody EquipementAppartement appartement) {
	      if (appartement!=null) {
	        equipementService.delete(appartement);
	      } 
	    }


}
