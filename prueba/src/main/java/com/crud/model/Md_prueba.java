package com.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "tb_pruebas")
public class Md_prueba {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	//sirve para colocar el id como autoincremental
	private Integer id;
	
	private String persona;
	private String cedula;
	
	
	public Md_prueba() {
		super();
	}
	
	
	
	public Md_prueba(Integer id, String persona, String cedula) {
		super();
		this.id = id;
		this.persona = persona;
		this.cedula = cedula;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPersona() {
		return persona;
	}
	public void setPersona(String persona) {
		this.persona = persona;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	@Override
	public String toString() {
		return "prueba [id=" + id + ", persona=" + persona + ", cedula=" + cedula + "]";
	}
	
	

}
