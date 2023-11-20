package com.libreria.libro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.libreria.libro.dao.LibroRepository;
import com.libreria.libro.entity.Libro;

@Service
public class LibroServiceImpl  implements LibroService{
	@Autowired
	private LibroRepository libroRepository;
	@Override
	@Transactional(readOnly = true)
	public List<Libro> findAll() {
		return (List<Libro>) libroRepository.findAll();
	}

	@Override
	public Libro findBy(Integer id) {
		return libroRepository.findById(id).orElse(null);
	}
	
    @Override
    @Transactional(readOnly = true)
    public List<Libro> findByTitulo(String titulo) {
        return libroRepository.findByTitulo(titulo);
    }
	
    @Override
    @Transactional(readOnly = true)
    public List<Libro> findByAutor(String autor) {
        return libroRepository.findByAutor(autor);
    }
	
    @Override
    @Transactional(readOnly = true)
    public List<Libro> findByGenero(String genero) {
        return libroRepository.findByGenero(genero);
    }
	
    @Override
    @Transactional(readOnly = true)
    public List<Libro> findByDisponibilidad(Boolean disponibilidad) {
        return libroRepository.findByDisponibilidad(disponibilidad);
    }
	
    @Override
    @Transactional(readOnly = true)
    public List<Libro> findByExistencias(Integer existencias) {
        return libroRepository.findByExistencias(existencias);
    }

}
