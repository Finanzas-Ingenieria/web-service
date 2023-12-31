package com.creditovehicular.creditovehicularapi.service.impl;

import com.creditovehicular.creditovehicularapi.entities.Client;
import com.creditovehicular.creditovehicularapi.repository.IClientRepository;
import com.creditovehicular.creditovehicularapi.service.IClientService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class ClientServiceImpl implements IClientService {

    private final IClientRepository clientRepository;

    public ClientServiceImpl(IClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    @Transactional
    public Client save(Client client) throws Exception {
        return clientRepository.save(client);
    }

    @Override
    @Transactional
    public void delete(Long id) throws Exception {
        clientRepository.deleteById(id);
    }

    @Override
    public List<Client> getAll() throws Exception {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> getById(Long id) throws Exception {
        return clientRepository.findById(id);
    }
}
