package com.spring.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entity.Dirrecion;
import com.spring.boot.repository.DirrecionRepository;

@Service
public class DirrecionServiceImpl implements DirrecionService {

	@Autowired
	public DirrecionRepository repositorio;
	
	@Override
	public List<Dirrecion> listar() {
		return repositorio.findAll();
	}

	@Override
	public Dirrecion guardar(Dirrecion dirrecion) {
		return repositorio.save(dirrecion);
	}

	@Override
	public Dirrecion buscarPorId(Integer id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Dirrecion actualizar(Dirrecion dirrecion) {
		return repositorio.save(dirrecion);
	}

	@Override
	public void eliminar(Integer id) {
		repositorio.deleteById(id);
	}

	
}
