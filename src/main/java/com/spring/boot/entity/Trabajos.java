package com.spring.boot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="trabajos")
public class Trabajos {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String cargo;
	private String nContrato; 
	private String fecha;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="id_persona")
	private Personas personas;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getnContrato() {
		return nContrato;
	}
	public void setnContrato(String nContrato) {
		this.nContrato = nContrato;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Personas getPersonas() {
		return personas;
	}
	public void setPersonas(Personas personas) {
		this.personas = personas;
	}
	
}
