package cml.ejercicio1.entidad;

import java.util.Date;

public class Paciente {
	
	String rut;
	String nombre;
	String apellido;
	int edad;
	boolean estadoCovid;
	Date fechaDeContagio;

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isEstadoCovid() {
		return estadoCovid;
	}

	public void setEstadoCovid(boolean estadoCovid) {
		this.estadoCovid = estadoCovid;
	}

	public Date getFechaDeContagio() {
		return fechaDeContagio;
	}

	public void setFechaDeContagio(Date fechaDeContagio) {
		this.fechaDeContagio = fechaDeContagio;
	}
}
