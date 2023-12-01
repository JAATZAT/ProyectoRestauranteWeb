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

import com.cibertec.model.MetodosPago;
import com.cibertec.service.iMetodosPagoService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/metodospago")
public class MetodosPagoController {
	@Autowired 
	iMetodosPagoService service;
	

	// Listar
	@GetMapping
	public List<MetodosPago> listar() {
		List<MetodosPago> lista = service.listar();
		return lista;
	}

	// Listar por id
	@GetMapping("/{id}")
	public MetodosPago listarPorId(@PathVariable("id") int id) {
		MetodosPago a = service.listarPorId(id);
		return a;
	}
	
	// Registrar
	@PostMapping
	public MetodosPago registrar(@RequestBody MetodosPago ca) {
		MetodosPago a = service.registrar(ca);
		return a;
	}
}
