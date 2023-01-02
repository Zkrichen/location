package com.residence.location.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.residence.location.model.Reservation;
import com.residence.location.service.ReservationService;

@RestController
@RequestMapping("/reservations")
@CrossOrigin(origins = "http://localhost:4200/")

public class ReservationController {
	@Autowired
	public ReservationService resService;
    @GetMapping(value="/", produces = { MediaType.APPLICATION_JSON_VALUE})
	public List<Reservation> getAll (@RequestParam String field) {
		return resService.findAll(Sort.by(Direction.ASC, field));
	}
    
    @GetMapping(value="/checkIn", produces = { MediaType.APPLICATION_JSON_VALUE})
	public List<Reservation> getAllCheckIn() {
		return resService.getCheckIN();
	}
    
    
    @GetMapping(value="/checkOut", produces = { MediaType.APPLICATION_JSON_VALUE})
	public List<Reservation> getCheckOut() {
		return resService.getCheckOUT();
	}
	
	
    @PostMapping("/")
    public ResponseEntity<Reservation> createReservation(@RequestBody Reservation res) {
      try {
    	  Reservation _app = resService.createOrEditRes(res);
        return new ResponseEntity<>(_app, HttpStatus.CREATED);
      } catch (Exception e) {
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }
    
    @PutMapping()
    public ResponseEntity<Reservation> updateClient(@RequestBody Reservation res) {

      if (res!=null) {
    	  Reservation _app = resService.createOrEditRes(res);

        return new ResponseEntity<>(_app, HttpStatus.OK);
      } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
    }
    
    
    @GetMapping("/{id}")
    public ResponseEntity<Reservation> getClientById(@PathVariable("id") Integer id) {
       Optional<Reservation> resData = resService.getRes(id);

      if (resData.isPresent()) {
        return new ResponseEntity<>(resData.get(), HttpStatus.OK);
      } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
    }

}
