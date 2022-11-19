package com.spring.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entity.Transporte;
import com.spring.boot.repository.TransporteRepository;

@Service
public class TransporteServiceImpl implements TransporteService {

	@Autowired
	public TransporteRepository repositorio;
	
	@Override
	public List<Transporte> listar() {
		return repositorio.findAll();
	}

	@Override
	public Transporte guardar(Transporte transporte) {
		return repositorio.save(transporte);
	}

	@Override
	public Transporte buscarPorId(Integer id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Transporte actualizar(Transporte transporte) {
		return repositorio.save(transporte);
	}

	@Override
	public void eliminar(Integer id) {
		repositorio.deleteById(id);
	}

	
	
}
