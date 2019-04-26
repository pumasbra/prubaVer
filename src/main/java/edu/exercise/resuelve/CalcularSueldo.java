package edu.exercise.resuelve;

import java.util.ArrayList;
import java.util.List;
/**
 * Clase que calcula los bonos reales a nivel equipo y jugador, para poder calcular el sueldo completo de los jugadores 
 * @author Brahian Velazquez
 * */

public class CalcularSueldo{

	private float totalGolesMesNecesarios;
	private float totalGolesPorMes;
	private List<Nivel> listaNiveles = new ArrayList<Nivel>();
	private float porcentajeBonoEquipo;
	public float getTotalGolesMesNecesarios() {
		return totalGolesMesNecesarios;
	}
	public void setTotalGolesMesNecesarios(float totalGolesMesNecesarios) {
		this.totalGolesMesNecesarios = totalGolesMesNecesarios;
	}
	public float getTotalGolesPorMes() {
		return totalGolesPorMes;
	}
	public void setTotalGolesPormes(float totalGolesPorMes) {
		this.totalGolesPorMes = totalGolesPorMes;
	}
	public float getPorcentajeBonoEquipo() {
		return porcentajeBonoEquipo;
	}
	public List<Nivel> getListaNiveles() {
		return listaNiveles;
	}
	public void setListaNiveles(List<Nivel> listaNiveles) {
		this.listaNiveles = listaNiveles;
	}
	
	
	/**
	 * Calcula el bono real de todos los jugadores , tambien el sueldo completo 
	 * */
	public void calcularBonoEquipo(List <Jugador> jugadores) {
		calcularPorcentajeBonoEquipo();
		for(Jugador jugador: jugadores) {
			float bonaBase = jugador.getBono()/2;
			float bonoReal =  (bonaBase * calcularPorcentajeBonoJugador(jugador) /100)  + (bonaBase * porcentajeBonoEquipo /100);  
			jugador.setBonoReal(bonoReal); 
			jugador.setSueldoCompleto(bonoReal + jugador.getSueldo());
		}
	}
	
	/**
	 *  Calcula el porcentaje de bono del equipo mediante regla de tres. 
	 **/
	public void calcularPorcentajeBonoEquipo() {
		if(totalGolesPorMes >= totalGolesMesNecesarios) 
			porcentajeBonoEquipo = 100.f;
		else
			porcentajeBonoEquipo = (totalGolesPorMes * 100) / totalGolesMesNecesarios;
	}
	
	/**
	 *   Calcula el porcentaje de bono del jugador mediante regla de tres
	 *   @param jugador
	 *   @return porcentajeBonoIndividual
	 **/
	public float calcularPorcentajeBonoJugador(Jugador jugador) {
		int golesJugador = jugador.getGoles();
		int golesNecesarios = obtenerGolesPorNivel(jugador.getNivel());
		if(golesJugador >= golesNecesarios)
			return 100.f;
		else
			return (golesJugador *100) / golesNecesarios;
	}
	
	/**
	 * Calcula los goles por mes y goles necesarios por mes de todos los jugadores 
	 * 
	 * */
	public void calcularGoles(List<Jugador> jugadores) {
		for (Jugador jugador: jugadores) {
			totalGolesMesNecesarios+= obtenerGolesPorNivel(jugador.getNivel());
			totalGolesPorMes+= jugador.getGoles();
		}
		
	}
	
	/**
	 * Es base al nivel obtiene los goles necesario por mes para un jugador
	 * @param nivel
	 * @return goles
	 * */
	public int obtenerGolesPorNivel(String nivel) {
		return listaNiveles.stream()
					.filter(index -> index.getNivel()
					.contains(nivel))
					.findFirst().orElse(null)
					.getGolesPorMes();
	}
	
	/**
	 * Llena la lista con los niveles definidos
	 * */
	public void llenarListaNiveles() {
			listaNiveles.add(new Nivel("A", 5));
			listaNiveles.add(new Nivel("B", 10));
			listaNiveles.add(new Nivel("C", 15));
			listaNiveles.add(new Nivel("Cuauh", 20));
	}
	 	
}
