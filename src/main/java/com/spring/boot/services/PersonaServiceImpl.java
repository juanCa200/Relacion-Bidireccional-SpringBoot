package com.spring.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entity.Dirrecion;
import com.spring.boot.entity.Personas;
import com.spring.boot.entity.Transporte;
import com.spring.boot.repository.DirrecionRepository;
import com.spring.boot.repository.PersonaRepository;
import com.spring.boot.repository.TransporteRepository;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	public PersonaRepository repositorio;
	
	@Autowired
	public DirrecionRepository dirrecionRepository;
	
	@Autowired
	public TransporteRepository transporteRepository;

	@Override
	public List<Personas> listar() {
		return repositorio.findAll();
	}

	@Override
	public Personas guardar(Personas personas) {
		Optional<Dirrecion> dirrecion = dirrecionRepository.findById(personas.getDirrecion().getId());
		Optional<Transporte> transporte = transporteRepository.findById(personas.getTransporte().getId());
		if(dirrecion==null || transporte==null){}
		personas.setDirrecion(dirrecion.get());
		personas.setTransporte(transporte.get());
		return repositorio.save(personas);
	}

	@Override
	public Personas buscarPorId(Integer id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Personas actualizar(Personas personas) {
		return repositorio.save(personas);
	}

	@Override
	public void eliminar(Integer id) {
		repositorio.deleteById(id);
	}

}
