package com.residence.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.residence.location.model.Client;
import com.residence.location.repository.ClientRepository;
@Component
@Transactional
public class ClientServiceImpl implements ClientService {
	@Autowired
	ClientRepository clientRepo;

	@Override
	public List<Client> getAll() {
		
		return clientRepo.findAll();
	}

	@Override
	public Client createOrEditClient(Client client) {
		return clientRepo.save(client);
	}
	
	@Override
	public Optional<Client> getClient(Integer id) {
		return clientRepo.findById(id);
	}
	
	@Override
	public void delete(Client client) {
		 clientRepo.delete(client);
	}

}
