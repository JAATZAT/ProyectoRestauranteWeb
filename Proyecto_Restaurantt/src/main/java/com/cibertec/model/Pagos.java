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
@Table(name = "pagos")
public class Pagos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPago;
	
	@ManyToOne
	@JoinColumn(name = "idPedido")
	private Pedidos pedidos;
	
	@ManyToOne
	@JoinColumn(name = "idMetodoPago")
	private MetodosPago metodosPago;
	
	@NotNull
	private double monto;
	
	@NotNull
	private Date fechaPago;

	//Fecha por defecto
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    public Date getFechaPago() {
        return fechaPago;
    }
	
	@PrePersist
	public void prePersist() {
		fechaPago = new Date();
	}
}
