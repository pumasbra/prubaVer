package edu.exercise.resuelve;

/**
 * Clase que representa los niveles de los futbolistass
 * @author Brahian Velazquez
 * */
public class Nivel {
	private String nivel;
	private int golesPorMes;

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public int getGolesPorMes() {
		return golesPorMes;
	}

	public void setGolesPorMes(int golesPorMes) {
		this.golesPorMes = golesPorMes;
	}

	public Nivel() {}
	public Nivel(String nivel, int golesPorMes) {
		this.nivel = nivel;
		this.golesPorMes = golesPorMes;
	}
}
