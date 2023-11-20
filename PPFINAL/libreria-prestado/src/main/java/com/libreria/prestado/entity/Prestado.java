package com.libreria.prestado.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class Prestado {

	private Libro libro;
	private Integer cantidad;
	
	public Prestado() {
		
	}
	public Prestado(Libro libro, Integer cantidad) {
		this.libro = libro;
		this.cantidad = cantidad;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Double getTotal() {
			return libro.getPrecio() * cantidad;
	}
	/*@Column(name = "fechaCompra")
	@Temporal(TemporalType.DATE)
	private Date fechaCompra;*/
	
	
}
