package com.residence.location.service;

import java.util.List;
import java.util.Optional;

import com.residence.location.model.Client;

public interface ClientService {
 public List<Client> getAll();
 public Client createOrEditClient(Client client);
 public Optional<Client> getClient(Integer id);
 void delete(Client client);
 

}
