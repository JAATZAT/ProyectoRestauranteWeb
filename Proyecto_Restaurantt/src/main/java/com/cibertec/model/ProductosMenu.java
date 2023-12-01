package com.cibertec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "productosMenu")
public class ProductosMenu {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idProducto;
	
	@NotEmpty
	private String nombreProducto;

	@NotNull
	private double precio;
	
	@ManyToOne
	@JoinColumn(name = "idCategoria")
	private Categorias categorias;
	
	private double descuento;
	

}
