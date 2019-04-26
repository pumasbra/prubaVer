package edu.exercise.resuelve;

/**
 * Clase que representa un jugador 
 * @author Brahian Velazquez
 * */
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Jugador {
	private String nombre;
	private String nivel;
	private int goles;
	
	// Usamos la anotacion para usar una conversion del tipo Float entre JSON y JAVA  definida por nosotros mediante la clase DecimalJsonSerializer.
	@JsonSerialize(using=DecimalJsonSerializer.class) 
	private Float sueldo;
	
	@JsonSerialize(using=DecimalJsonSerializer.class)
	private Float bono;
	
	@JsonSerialize(using=DecimalJsonSerializer.class)
	@JsonProperty("bono_real")  // JsonProperty: Anotacion usada para guardar la variable bonoReal como  "bono_real", cuando se realiza la conversion de JAVA a JSON .
	private Float bonoReal;
	
	@JsonSerialize(using=DecimalJsonSerializer.class)
	@JsonAlias("sueldo_completo") // JsonAlias: Anotacion usada para guardar el dato "sueldo_completo"  a la variable sueldo_completo en la conversion de JSON a JAVA.
	@JsonProperty("sueldo_completo")
	private Float sueldoCompleto;
	
	private String equipo;
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public float getBono() {
		return bono;
	}

	public void setBono(float bono) {
		this.bono = bono;
	}

	public float getBonoReal() {
		return bonoReal;
	}

	public void setBonoReal(float bonoReal) {
		this.bonoReal = bonoReal;
	}

	public float getSueldoCompleto() {
		return sueldoCompleto;
	}

	public void setSueldoCompleto(Float sueldoCompleto) {
		this.sueldoCompleto = sueldoCompleto;
	}

	
	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public Jugador() {}

	public Jugador(String nombre, String nivel, int goles, float sueldo, float bono,float bonoReal, float sueldoCompleto, String equipo) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.goles = goles;
		this.sueldo = sueldo;
		this.bono = bono;
		this.bonoReal = bonoReal;
		this.sueldoCompleto = sueldoCompleto;
		this.equipo = equipo;
	}

}
