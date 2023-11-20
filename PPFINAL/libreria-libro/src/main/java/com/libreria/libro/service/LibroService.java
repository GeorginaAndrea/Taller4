package com.libreria.libro.service;

import java.util.List;

import com.libreria.libro.entity.Libro;


public interface LibroService {

	public List<Libro> findAll();
	public Libro findBy(Integer id);
	public List<Libro> findByTitulo(String titulo);
	public List<Libro> findByAutor(String autor);
	public List<Libro> findByGenero(String genero);
	public List<Libro> findByDisponibilidad(Boolean disponibilidad);
	public List<Libro> findByExistencias(Integer existencias);
}
