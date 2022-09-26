package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;



public class Zoologico {
		private String nombre;
		private String ubicacion;
		private ArrayList<Zona> zonas;
		
		
		public Zoologico() {
			this(null,null);
		}
		public Zoologico(String nombre, String ubicacion){
			this.nombre=nombre;
			this.ubicacion=ubicacion;
			
		}
		
	    public void agregarZonas (Zona zona) { 	
	    	zonas.add(zona);	    					
		}
	    public String getNombre() {
	    	return nombre;
	    	
	    }
	    public void setNombre (String nombre) {
	    	this.nombre= nombre;
	    }
	    public String getUbicacion() {
	    	return ubicacion;
	    	
	    }
	    public void setUbicacion (String ubicacion) {
	    	this.ubicacion= ubicacion;
	    }
	    public ArrayList<Zona> getZona() {
	    		return zonas;
	    }
			
	    
	    public void setZona(ArrayList<Zona> zona) {
			 this.zonas= zona;
		 }
	    
	    public int cantidadTotalAnimales() {
			int contadorAnimales= 0;
			for(Zona zona:zonas) {
				contadorAnimales+=zona.cantidadAnimales();
				}
			return contadorAnimales;
		}
		
}
		

