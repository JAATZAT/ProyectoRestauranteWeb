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

import com.cibertec.model.ItemsPedido;
import com.cibertec.service.iItemsPedidoService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/itemspedidos")
public class ItemsPedidosController {
	
	@Autowired 
	iItemsPedidoService service;
	

	// Listar
	@GetMapping
	public List<ItemsPedido> listar() {
		List<ItemsPedido> lista = service.listar();
		return lista;
	}

	// Listar por id
	@GetMapping("/{id}")
	public ItemsPedido listarPorId(@PathVariable("id") int id) {
		ItemsPedido a = service.listarPorId(id);
		return a;
	}
	
	// Registrar
	@PostMapping
	public ItemsPedido registrar(@RequestBody ItemsPedido ca) {
		ItemsPedido a = service.registrar(ca);
		return a;
	}
}
