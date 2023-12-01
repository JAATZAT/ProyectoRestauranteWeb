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

import com.cibertec.model.OpcionesEntrega;
import com.cibertec.service.iOpcionesEntregaService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/opcionesentrega")
public class OpcionesEntregaController {
	@Autowired 
	iOpcionesEntregaService service;
	

	// Listar
	@GetMapping
	public List<OpcionesEntrega> listar() {
		List<OpcionesEntrega> lista = service.listar();
		return lista;
	}

	// Listar por id
	@GetMapping("/{id}")
	public OpcionesEntrega listarPorId(@PathVariable("id") int id) {
		OpcionesEntrega a = service.listarPorId(id);
		return a;
	}
	
	// Registrar
	@PostMapping
	public OpcionesEntrega registrar(@RequestBody OpcionesEntrega ca) {
		OpcionesEntrega a = service.registrar(ca);
		return a;
	}
}
