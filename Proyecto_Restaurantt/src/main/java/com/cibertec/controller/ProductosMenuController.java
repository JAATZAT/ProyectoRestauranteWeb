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

import com.cibertec.model.ProductosMenu;
import com.cibertec.service.iProductosMenuService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/productosmenu")
public class ProductosMenuController {
	@Autowired 
	iProductosMenuService service;
	

	// Listar
	@GetMapping
	public List<ProductosMenu> listar() {
		List<ProductosMenu> lista = service.listar();
		return lista;
	}

	// Listar por id
	@GetMapping("/{id}")
	public ProductosMenu listarPorId(@PathVariable("id") int id) {
		ProductosMenu a = service.listarPorId(id);
		return a;
	}
	
	// Registrar
	@PostMapping
	public ProductosMenu registrar(@RequestBody ProductosMenu ca) {
		ProductosMenu a = service.registrar(ca);
		return a;
	}
}
