package com.libreria.prestado.servicio;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.libreria.prestado.entity.Libro;
import com.libreria.prestado.entity.Prestado;

@Service
public class PrestadoServiceImpl implements PrestadoService {

	@Autowired
	private RestTemplate clienteRest;
	
	@Override
	public List<Prestado>listarPrestado() {
		List<Libro> libro = libro = Arrays.asList(clienteRest.getForObject("http://localhost:8081/libros/all", Libro[].class));
		return libro.stream().map(p-> new Prestado(p,1)).collect(Collectors.toList());
	}
	@Override
	public Prestado findBy(Integer idLibro, Integer cantidad) {
		Map<String, String> pathVariables = new HashMap<String,String>();
		pathVariables.put("id", idLibro.toString());
		Libro libro = clienteRest.getForObject("http://localhost:8081/libros/{id}", Libro.class, pathVariables);
		return new Prestado(libro, cantidad);
	}

}
