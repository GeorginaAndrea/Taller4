package com.libreria.prestado.servicio;

import java.util.List;

import com.libreria.prestado.entity.Prestado;

public interface PrestadoService {

	List<Prestado>listarPrestado();
	Prestado findBy(Integer idPrestado, Integer cantidad);
	
}
