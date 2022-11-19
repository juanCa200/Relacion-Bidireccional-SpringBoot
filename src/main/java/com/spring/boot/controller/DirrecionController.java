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

import com.spring.boot.entity.Dirrecion;
import com.spring.boot.services.DirrecionServiceImpl;

@RestController
@RequestMapping("/dirrecion")
public class DirrecionController {

	@Autowired
	public DirrecionServiceImpl service;
	
	@GetMapping
	public List<Dirrecion> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Dirrecion guardar(@RequestBody Dirrecion dirrecion){
		return service.guardar(dirrecion);
	}
	
	@GetMapping("/{id}")
	public Dirrecion buscarPorId(@PathVariable("id")Integer id) {
		return service.buscarPorId(id);
	}
	
	@PutMapping("/{id}")
	public Dirrecion actualizar(@RequestBody Dirrecion dirrecion, @PathVariable("id") Integer id){
		Dirrecion dir = service.buscarPorId(id);
	    dir.setCalle(dirrecion.getCalle());
	    dir.setBarrio(dirrecion.getBarrio());
	    dir.setCasa(dirrecion.getCasa());
	    return service.guardar(dir);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id")Integer id) {
		service.eliminar(id);
	}
	
	
	
}
