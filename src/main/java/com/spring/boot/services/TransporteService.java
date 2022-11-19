package com.spring.boot.services;

import java.util.List;

import com.spring.boot.entity.Transporte;

public interface TransporteService {

	public List<Transporte> listar();
	public Transporte guardar(Transporte transporte);
	public Transporte buscarPorId(Integer id);
	public Transporte actualizar(Transporte transporte);
	public void eliminar(Integer id);
	
}
