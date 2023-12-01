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

import com.cibertec.model.HistorialPedidos;
import com.cibertec.service.iHistorialPedidosService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/historialpedidos")
public class HistorialPedidosController {

	@Autowired 
	iHistorialPedidosService service;
	

	// Listar
	@GetMapping
	public List<HistorialPedidos> listar() {
		List<HistorialPedidos> lista = service.listar();
		return lista;
	}

	// Listar por id
	@GetMapping("/{id}")
	public HistorialPedidos listarPorId(@PathVariable("id") int id) {
		HistorialPedidos a = service.listarPorId(id);
		return a;
	}
	
	// Registrar
	@PostMapping
	public HistorialPedidos registrar(@RequestBody HistorialPedidos ca) {
		HistorialPedidos a = service.registrar(ca);
		return a;
	}
	
	
}
