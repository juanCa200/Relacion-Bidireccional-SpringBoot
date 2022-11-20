package com.spring.boot.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="transporte")
public class Transporte {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="nombre_transporte",unique=true)
	private String transporte;
	
	@OneToMany(mappedBy="transporte")
	@JsonIgnore
	private List<Personas> personas;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTransporte() {
		return transporte;
	}
	public void setTransporte(String transporte) {
		this.transporte = transporte;
	}
	public List<Personas> getPersonas() {
		return personas;
	}
	public void setPersonas(List<Personas> personas) {
		this.personas = personas;
	}
	
	
}
