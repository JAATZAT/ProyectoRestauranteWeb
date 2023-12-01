package com.cibertec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.model.ItemsPedido;
import com.cibertec.repository.IGenericRepo;
import com.cibertec.repository.IItemsPedidoRepo;
import com.cibertec.service.iItemsPedidoService;


@Service
public class ItemsPedidoServiceImpl extends CRUDImpl<ItemsPedido, Integer> implements iItemsPedidoService {

	@Autowired
	private IItemsPedidoRepo ItemsPedidoRepo;
	
	@Override
	protected IGenericRepo<ItemsPedido, Integer> getRepo() {
		// TODO Auto-generated method stub
		return ItemsPedidoRepo;
	}

}
