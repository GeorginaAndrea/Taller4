package com.libreria.prestado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.prestado.entity.Prestado;
import com.libreria.prestado.servicio.PrestadoService;

@RestController
@RequestMapping("/comprado")
public class PrestadoController {

	@Autowired
	private PrestadoService prestadoService;
	
	@GetMapping("/listar")
	public List<Prestado> listarPrestado(){
		return prestadoService.listarPrestado();
	}
	
	@GetMapping("/{id}/{cantidad}")
	public Prestado findBy(@PathVariable Integer id, @PathVariable Integer cantidad ) {
		return prestadoService.findBy(id, cantidad);
	}
}
