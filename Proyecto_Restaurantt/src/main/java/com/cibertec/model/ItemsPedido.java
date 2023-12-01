package com.cibertec.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "itemsPedido")
public class ItemsPedido {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idItemsPedido;
	
	@ManyToOne
	@JoinColumn(name = "idPedido")
	private Pedidos pedidos;
	
	@ManyToOne
	@JoinColumn(name = "idProducto")
	private ProductosMenu productosMenu;
	
	@NotNull
	private int cantidad;
	
	private String personalizacion;

}
