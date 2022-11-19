package com.spring.boot.services;

import java.util.List;

import com.spring.boot.entity.Personas;

public interface PersonaService {

	public List<Personas> listar();
	public Personas guardar(Personas personas);
	public Personas buscarPorId(Integer id);
	public Personas actualizar(Personas personas);
	public void eliminar(Integer id);
	
}
