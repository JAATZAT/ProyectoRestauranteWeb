package com.cibertec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "metodosPago")
public class MetodosPago {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idMetodoPago;
	
	@NotEmpty
	private String nombreMetodo;

}
