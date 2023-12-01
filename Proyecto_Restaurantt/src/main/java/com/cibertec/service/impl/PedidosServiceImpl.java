package com.cibertec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.model.Pedidos;
import com.cibertec.repository.IGenericRepo;
import com.cibertec.repository.IPedidosRepo;
import com.cibertec.service.iPedidosService;


@Service
public class PedidosServiceImpl extends CRUDImpl<Pedidos, Integer> implements iPedidosService {

	@Autowired
	private IPedidosRepo pedidosRepo;
	
	@Override
	protected IGenericRepo<Pedidos, Integer> getRepo() {
		// TODO Auto-generated method stub
		return pedidosRepo;
	}

}
