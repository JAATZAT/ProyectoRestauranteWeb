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
@Table(name = "opcionesEntrega")
public class OpcionesEntrega {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idOpcionEntrega;
	
	@NotEmpty
	private String nombreOpcion;
}
