package com.libreria.libro.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.libreria.libro.entity.Libro;

public interface LibroRepository extends CrudRepository<Libro, Integer>{

	List<Libro> findByTitulo(String titulo);
	List<Libro> findByGenero(String genero);
	List<Libro> findByAutor(String autor);
	List<Libro> findByDisponibilidad(Boolean disponibilidad);
	List<Libro> findByExistencias(Integer existencias);
}
