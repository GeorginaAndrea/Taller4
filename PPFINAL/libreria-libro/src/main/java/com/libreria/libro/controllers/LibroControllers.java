package com.libreria.libro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.libro.entity.Libro;
import com.libreria.libro.service.LibroService;

@RestController
@RequestMapping("/libros")
public class LibroControllers {
	
	@Autowired
	private LibroService libroService;
	@GetMapping("/all")
	public List<Libro> listar(){
		return libroService.findAll();
	}
	
	@GetMapping("/{id}")
	public Libro detalle(@PathVariable Integer id) {
		return libroService.findBy(id);
	}
	
    @GetMapping("/t/{titulo}")
    public List<Libro> buscarPorTitulo(@PathVariable String titulo) {
        return libroService.findByTitulo(titulo);
    }
    
    @GetMapping("/a/{autor}")
    public List<Libro> buscarPorAutor(@PathVariable String autor) {
        return libroService.findByAutor(autor);
    }
    
    @GetMapping("/g/{genero}")
    public List<Libro> buscarPorGenero(@PathVariable String genero) {
        return libroService.findByGenero(genero);
    }
    
    @GetMapping("/d/{disponibilidad}")
    public List<Libro> buscarPorDisponibilidad(@PathVariable Boolean disponibilidad) {
        return libroService.findByDisponibilidad(disponibilidad);
    }
    
    @GetMapping("/e/{existencias}")
    public List<Libro> buscarPorExistencias(@PathVariable Integer existencias) {
        return libroService.findByExistencias(existencias);
    }
}
