package com.spring.boot.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="personas")
public class Personas {
	
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String apellido;
	private Integer edad;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_trabajo",referencedColumnName="id")
	private List<Trabajos> trabajo;
	
	@OneToOne
	@JoinColumn(name="id_dirrecion",unique=true)
	private Dirrecion dirrecion;
	
	@ManyToOne
	@JoinColumn(name="id_transporte")
	private Transporte transporte;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Proyectos> proyectos; 
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public List<Trabajos> getTrabajo() {
		return trabajo;
	}
	public void setTrabajo(List<Trabajos> trabajo) {
		this.trabajo = trabajo;
	}
	public Dirrecion getDirrecion() {
		return dirrecion;
	}
	public void setDirrecion(Dirrecion dirrecion) {
		this.dirrecion = dirrecion;
	}
	public Transporte getTransporte() {
		return transporte;
	}
	public void setTransporte(Transporte transporte) {
		this.transporte = transporte;
	}
	public List<Proyectos> getProyectos() {
		return proyectos;
	}
	public void setProyectos(List<Proyectos> proyectos) {
		this.proyectos = proyectos;
	}
	

}
