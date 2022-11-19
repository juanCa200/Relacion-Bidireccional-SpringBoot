package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entity.Personas;
import com.spring.boot.services.PersonaServiceImpl;

@RestController
@RequestMapping("/relacion")
public class PersonaController {

	@Autowired
	public PersonaServiceImpl service;
	

	@GetMapping
	public List<Personas> listar() {
		return service.listar();
	}

	@GetMapping("/{id}")
	public Personas buscarPorId(@PathVariable("id") Integer id) {
		return service.buscarPorId(id);
	}

	@PostMapping
	public Personas guardar(@RequestBody Personas personas) {
		return service.guardar(personas);
	}

	@PutMapping("/{id}")
	public Personas actualizar(@RequestBody Personas personas, @PathVariable("id") Integer id) {
		Personas person = service.buscarPorId(id);
		person.setNombre(personas.getNombre());
		person.setApellido(personas.getApellido());
		person.setEdad(personas.getEdad());
		return service.guardar(person);
	}

	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}

}
