package com.sages4it.cursomc.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sages4it.cursomc.domain.Categoria;
import com.sages4it.cursomc.repositories.CategoriaRepository;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj  = repo.findById(id);	
		try {
			return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Objeto não encontrado! Id:"+ id + ", Tipo:" + Categoria.class.getName()));
		} catch (ObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
