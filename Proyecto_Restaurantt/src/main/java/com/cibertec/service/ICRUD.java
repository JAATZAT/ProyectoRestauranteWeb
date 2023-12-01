package com.cibertec.service;

import java.util.List;

public interface ICRUD<T,ID> {
	T registrar(T a);
	T modificar (T a);
	public List<T> listar();
	T listarPorId(ID id);
	void eliminar(ID id);
}