package com.cibertec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.model.OpcionesEntrega;
import com.cibertec.repository.IGenericRepo;
import com.cibertec.repository.IOpcionesEntregaRepo;
import com.cibertec.service.iOpcionesEntregaService;


@Service
public class OpcionesEntregaServiceImpl extends CRUDImpl<OpcionesEntrega, Integer> implements iOpcionesEntregaService{

	@Autowired
	private IOpcionesEntregaRepo opcionesEntregaRepo;
	
	@Override
	protected IGenericRepo<OpcionesEntrega, Integer> getRepo() {
		// TODO Auto-generated method stub
		return opcionesEntregaRepo;
	}

}
