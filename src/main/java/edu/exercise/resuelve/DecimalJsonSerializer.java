package edu.exercise.resuelve;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * Clase que se usara para la conversion de tipo Float a JSON  es un "CustomSerializer" 
 * @author Brahian Velazquez
 * */
public class DecimalJsonSerializer extends JsonSerializer<Float> {
	  @Override
	  public void serialize(Float value, JsonGenerator jgen, SerializerProvider provider) 
	    throws IOException, JsonProcessingException {
	      /* si el dato flotante tiene decimales se le quita el ".0" cuando se convierte a JSON
	       * de lo contrario se dejan 2 decimales 
		  */
		  if(value % 1 == 0)  
	    	  jgen.writeString(String.format("%.0f", value));
	      else
	    	  jgen.writeString(String.format("%.2f" , value));
	  }
	}