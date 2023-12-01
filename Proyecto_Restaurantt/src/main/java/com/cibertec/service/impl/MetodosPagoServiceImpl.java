package com.cibertec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.model.MetodosPago;
import com.cibertec.repository.IGenericRepo;
import com.cibertec.repository.IMetodosPagoRepo;
import com.cibertec.service.iMetodosPagoService;



@Service
public class MetodosPagoServiceImpl extends CRUDImpl<MetodosPago, Integer> implements iMetodosPagoService {

	@Autowired
	private IMetodosPagoRepo metodosPagoRepo;
	
	@Override
	protected IGenericRepo<MetodosPago, Integer> getRepo() {
		// TODO Auto-generated method stub
		return metodosPagoRepo;
	}

}
