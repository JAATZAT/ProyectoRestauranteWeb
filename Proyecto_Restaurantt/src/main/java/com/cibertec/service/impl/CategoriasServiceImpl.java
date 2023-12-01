package com.cibertec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.model.Categorias;
import com.cibertec.repository.ICategoriasRepo;
import com.cibertec.repository.IGenericRepo;
import com.cibertec.service.iCategoriasService;



@Service
public class CategoriasServiceImpl extends CRUDImpl<Categorias, Integer> implements iCategoriasService {

	@Autowired
	private ICategoriasRepo categoriasRepo;
	
	@Override
	protected IGenericRepo<Categorias, Integer> getRepo() {
		// TODO Auto-generated method stub
		return categoriasRepo;
	}

}
