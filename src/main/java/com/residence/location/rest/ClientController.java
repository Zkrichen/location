package com.residence.location.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.residence.location.model.Client;
import com.residence.location.service.ClientService;

@RestController
@RequestMapping("/clients")
public class ClientController {
@Autowired
public ClientService clientService;

	    @GetMapping(value="/", produces = { MediaType.APPLICATION_JSON_VALUE})
	    public List<Client> getClients() {
	        List<Client> clients= clientService.getAll();
	        return clients;
	    }
	    
	    @GetMapping("/{id}")
	    public ResponseEntity<Client> getClientById(@PathVariable("id") Integer id) {
	       Optional<Client> clientData = clientService.getClient(id);

	      if (clientData.isPresent()) {
	        return new ResponseEntity<>(clientData.get(), HttpStatus.OK);
	      } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	      }
	    }
	    
	    @PostMapping("/")
	    public ResponseEntity<Client> createClient(@RequestBody Client client) {
	      try {
	        Client _client = clientService
	            .createOrEditClient(client);
	        return new ResponseEntity<>(_client, HttpStatus.CREATED);
	      } catch (Exception e) {
	        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	      }
	    }

	    @PutMapping()
	    public ResponseEntity<Client> updateClient(@RequestBody Client client) {

	      if (client!=null) {
	       
	        return new ResponseEntity<>(clientService.createOrEditClient(client), HttpStatus.OK);
	      } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	      }
	    }
	    
	    @DeleteMapping()
	    public void delete(@RequestBody Client client) {
	      if (client!=null) {
	        clientService.delete(client);
	      } 
	    }


}
