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

import com.cibertec.model.Pagos;
import com.cibertec.service.iPagosService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/pagos")
public class PagosController {
	@Autowired 
	iPagosService service;
	

	// Listar
	@GetMapping
	public List<Pagos> listar() {
		List<Pagos> lista = service.listar();
		return lista;
	}

	// Listar por id
	@GetMapping("/{id}")
	public Pagos listarPorId(@PathVariable("id") int id) {
		Pagos a = service.listarPorId(id);
		return a;
	}
	
	// Registrar
	@PostMapping
	public Pagos registrar(@RequestBody Pagos ca) {
		Pagos a = service.registrar(ca);
		return a;
	}
}
