package com.cibertec.service.impl;

import java.util.List;

import com.cibertec.repository.IGenericRepo;
import com.cibertec.service.ICRUD;



public abstract class CRUDImpl <T, ID>implements ICRUD<T, ID> {
	
	protected abstract IGenericRepo<T, ID> getRepo();
	
	@Override
	public T registrar(T a) {
		return getRepo().save(a);
	}

	@Override
	public T modificar(T a) {
		return getRepo().save(a);
	}

	@Override
	public List<T> listar() {
		return getRepo().findAll();
	}

	@Override
	public T listarPorId(ID id) {
		return getRepo().findById(id).get();
	}

	@Override
	public void eliminar(ID id) {
		getRepo().deleteById(id);
	}
	

}
