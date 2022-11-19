package com.spring.boot.services;

import java.util.List;

import com.spring.boot.entity.Dirrecion;

public interface DirrecionService {

	public List<Dirrecion> listar();
	public Dirrecion guardar(Dirrecion dirrecion);
	public Dirrecion buscarPorId(Integer id);
	public Dirrecion actualizar(Dirrecion dirrecion);
	public void eliminar(Integer id);
	
}
