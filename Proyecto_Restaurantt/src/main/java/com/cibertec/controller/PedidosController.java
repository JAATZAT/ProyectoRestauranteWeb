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

import com.cibertec.model.Pedidos;
import com.cibertec.service.iPedidosService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/pedidos")
public class PedidosController {
	@Autowired 
	iPedidosService service;
	

	// Listar
	@GetMapping
	public List<Pedidos> listar() {
		List<Pedidos> lista = service.listar();
		return lista;
	}

	// Listar por id
	@GetMapping("/{id}")
	public Pedidos listarPorId(@PathVariable("id") int id) {
		Pedidos a = service.listarPorId(id);
		return a;
	}
	
	// Registrar
	@PostMapping
	public Pedidos registrar(@RequestBody Pedidos ca) {
		Pedidos a = service.registrar(ca);
		return a;
	}
}
