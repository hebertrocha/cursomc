package com.hebertrocha.cursomc.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hebertrocha.cursomc.domain.Pedido;
import com.hebertrocha.cursomc.repositories.PedidoRepository;
import com.hebertrocha.cursomc.services.exceptions.ObjectNotFoundException;



@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) throws ObjectNotFoundException {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado: Id:" + id + ", Tipo: " + Pedido.class.getName()));

	}
	

}
