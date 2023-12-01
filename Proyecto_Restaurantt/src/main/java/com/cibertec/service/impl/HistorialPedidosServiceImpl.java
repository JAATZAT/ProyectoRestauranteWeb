package com.cibertec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.model.HistorialPedidos;
import com.cibertec.repository.IGenericRepo;
import com.cibertec.repository.IHistorialPedidosRepo;
import com.cibertec.service.iHistorialPedidosService;


@Service
public class HistorialPedidosServiceImpl extends CRUDImpl<HistorialPedidos, Integer> implements iHistorialPedidosService {

	@Autowired
	private IHistorialPedidosRepo historialPedidosRepo;
	
	@Override
	protected IGenericRepo<HistorialPedidos, Integer> getRepo() {
		// TODO Auto-generated method stub
		return historialPedidosRepo;
	}

}
