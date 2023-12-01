package com.cibertec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.model.ProductosMenu;
import com.cibertec.repository.IGenericRepo;
import com.cibertec.repository.IProductosMenuRepo;
import com.cibertec.service.iProductosMenuService;


@Service
public class ProductosMenuServiceImpl extends CRUDImpl<ProductosMenu, Integer> implements iProductosMenuService{

	@Autowired
	private IProductosMenuRepo productosMenuRepo;
	
	@Override
	protected IGenericRepo<ProductosMenu, Integer> getRepo() {
		// TODO Auto-generated method stub
		return productosMenuRepo;
	}

}
