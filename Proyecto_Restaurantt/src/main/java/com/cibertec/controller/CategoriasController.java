package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.model.Categorias;
import com.cibertec.service.iCategoriasService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/categorias/")
public class CategoriasController {

	@Autowired 
	iCategoriasService service;
	

	// Listar
	@GetMapping 
	public List<Categorias> listar() {
		List<Categorias> lista = service.listar();
		return lista;
	}

	// Listar por id
	@GetMapping("/{id}")
	public Categorias listarPorId(@PathVariable("id") int id) {
		Categorias a = service.listarPorId(id);
		return a;
	}
	
	// Registrar
	@PostMapping (value = "registrar")
	public Categorias registrar(@RequestBody Categorias ca) {
		Categorias a = service.registrar(ca);
		return a;
	}



	
}
