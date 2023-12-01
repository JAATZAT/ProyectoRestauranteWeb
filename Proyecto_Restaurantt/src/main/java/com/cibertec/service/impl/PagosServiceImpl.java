package com.cibertec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.model.Pagos;
import com.cibertec.repository.IGenericRepo;
import com.cibertec.repository.IPagosRepo;
import com.cibertec.service.iPagosService;



@Service
public class PagosServiceImpl extends CRUDImpl<Pagos, Integer> implements iPagosService {

	@Autowired
	private IPagosRepo pagosRepo;
	
	@Override
	protected IGenericRepo<Pagos, Integer> getRepo() {
		// TODO Auto-generated method stub
		return pagosRepo;
	}

}
