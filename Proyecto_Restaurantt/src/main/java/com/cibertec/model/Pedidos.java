package com.cibertec.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pedidos")
public class Pedidos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPedido;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private User user;
	
	@NotNull
	private Date fechaHoraPedido;

	@NotNull
	private double totalPedido;
	
	@ManyToOne
	@JoinColumn(name = "idOpcionEntrega")
	private OpcionesEntrega opcionesEntrega;
	
	@ManyToOne
	@JoinColumn(name = "idMetodoPago")
	private MetodosPago metodosPago;
	
	//Fecha por defecto
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    public Date getFechaHoraPedido() {
        return fechaHoraPedido;
    }
	@PrePersist
	public void prePersist() {
		fechaHoraPedido = new Date();
	}

}
