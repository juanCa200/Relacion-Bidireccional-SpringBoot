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

import com.spring.boot.entity.Transporte;
import com.spring.boot.services.TransporteServiceImpl;

@RestController
@RequestMapping("/transporte")
public class TransporteController {

	@Autowired
	public TransporteServiceImpl service;

	@GetMapping
	public List<Transporte> listar() {
		return service.listar();
	}

	@PostMapping
	public Transporte guardar(@RequestBody Transporte transporte) {
		return service.guardar(transporte);
	}

	@GetMapping("/{id}")
	public Transporte buscarPorId(@PathVariable("id") Integer id) {
		return service.buscarPorId(id);
	}

	@PutMapping("/{id}")
	public Transporte actualizar(@PathVariable("id") Integer id, @RequestBody Transporte transporte) {
		Transporte transpor = service.buscarPorId(id);
		transpor.setTransporte(transporte.getTransporte());
		return service.guardar(transpor);
	}

	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
}
