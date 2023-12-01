package com.cibertec.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "historialPedidos")
public class HistorialPedidos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idHistorialPedido;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "idPedido")
	private Pedidos pedidos;
	
	@ManyToOne
	@JoinColumn(name = "idItemsPedido")
	private ItemsPedido itemsPedido;

}
