package com.sages4it.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sages4it.cursomc.domain.Cliente;
import com.sages4it.cursomc.repositories.ClienteRepository;
import com.sages4it.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("cliente não encontrado! Id:"+ id));
		
	}
}
