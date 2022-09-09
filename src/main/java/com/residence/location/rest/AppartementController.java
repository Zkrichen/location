package com.residence.location.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.residence.location.model.Appartement;
import com.residence.location.service.AppartementService;

@RestController
@RequestMapping("/appartements")
@CrossOrigin(origins = "http://localhost:4200/")
public class AppartementController {
@Autowired
public AppartementService appService;

	    @GetMapping(value="/", produces = { MediaType.APPLICATION_JSON_VALUE})
	    public List<Appartement> getAppartements() {
	        List<Appartement> Appartements= appService.getAll();
	        return Appartements;
	    }
	    
	    @GetMapping("/{id}")
	    public ResponseEntity<Appartement> getAppartementById(@PathVariable("id") Integer id) {
	       Optional<Appartement> AppartementData = appService.getAppartement(id);

	      if (AppartementData.isPresent()) {
	        return new ResponseEntity<>(AppartementData.get(), HttpStatus.OK);
	      } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	      }
	    }
	    
	    @PostMapping("/")
	    public ResponseEntity<Appartement> createAppartement(@RequestBody Appartement app) {
	      try {
	        Appartement _app = appService
	            .createOrEditAppartement(app);
	        return new ResponseEntity<>(_app, HttpStatus.CREATED);
	      } catch (Exception e) {
	        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	      }
	    }

	    @PutMapping()
	    public ResponseEntity<Appartement> updateAppartement(@RequestBody Appartement appartement) {

	      if (appartement!=null) {
	       
	        return new ResponseEntity<>(appService.createOrEditAppartement(appartement), HttpStatus.OK);
	      } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	      }
	    }
	    
	    @DeleteMapping()
	    public void delete(@RequestBody Appartement appartement) {
	      if (appartement!=null) {
	        appService.delete(appartement);
	      } 
	    }


}
