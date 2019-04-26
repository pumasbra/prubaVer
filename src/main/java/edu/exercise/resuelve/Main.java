package edu.exercise.resuelve;



import java.io.File;
import java.io.IOException;
import java.util.List;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Clase principal que inicial el programa donde se leer la entrada del archivo Json y donde se guarda el resultado 
 * @author Brahian Velazquez
 * */
public class Main{ 
	ObjectMapper objectMapper = new ObjectMapper();
	
	/**
	 * Carga el archivo Json para convertirlo a una lista de objetos del tipo jugador el archivo, debe estar en la misma carpeta que el JAR
	 * En caso de que halla un error en la lectura del archivo terminara el programa
	 * @param nombreArchivo
	 * @return jugadores
	 * */
	public List<Jugador> cargarArchivoJson(String nombreArchivo) {
		objectMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
		File file = new File(nombreArchivo);
		List<Jugador> jugadores = null;

		try {
			jugadores = objectMapper.readValue(file, new TypeReference<List<Jugador>>() {});
		} catch (IOException e) {
			System.out.println(" NO SE ENCONTRO ARCHIVO O NO PUDO LEER EL ARCHIVO : " + nombreArchivo);
			e.printStackTrace();
			System.exit(0);
		}

		return jugadores;
	}
	
	/**
	 * Guarda la lista de jugadores resultante, se guardara en la misma carpeta donde se ejecute el jar
	 * @param nombreArchivo
	 * */
	public void guardarArchivoJsonSalida(String nombreArchivo, List<Jugador> jugadores) {
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		 try {
				objectMapper.writeValue(new File(nombreArchivo), jugadores);
			} catch (IOException e) {
				System.out.println(" ERROR AL TRATAE DE GUARDAR EL ARCHIVO : " + nombreArchivo);
				e.printStackTrace();
			}
	}
	
  public static void main(String[] args){
	Main main = new Main(); 
	CalcularSueldo calcularSueldo = new CalcularSueldo();
	List<Jugador> jugadores = main.cargarArchivoJson("input.json");
	
	System.out.println("ARCHIVO CARGADO CORRECTAMENTE PROCESANDO ...");
	
	calcularSueldo.llenarListaNiveles();
	calcularSueldo.calcularGoles(jugadores);
	calcularSueldo.calcularBonoEquipo(jugadores); 
	main.guardarArchivoJsonSalida("output.json", jugadores);
	
	System.out.println("ARCHIVO GUARDADO CORRECTAMENTE PROCESANDO ...");
  }
}
