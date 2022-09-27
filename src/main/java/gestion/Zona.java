package gestion;
import java.util.ArrayList;

import zooAnimales.Animal;


public class Zona {
	private String nombre;
	private static Zoologico zoo;	
	private ArrayList<Animal> animales= new ArrayList<>();
	
	

	public Zona() {
		this(null,null);
	 
	}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre=nombre;
		Zona.zoo= zoo;
	}	
	
	public void agregarAnimales (Animal animal) { 
    	animales.add(animal);	    					
	 }
	
	 public String getNombre() {
	    	return nombre;
	    	
	 }
	 
	 public void setNombre (String nombre) {
	    	this.nombre= nombre;
	 }
	 
	 public static Zoologico getZoo() {
	    	return zoo;
	    	
	 }
	 
	 public void setZoo (Zoologico zoo) {
	    	Zona.zoo= zoo;
	 }
	 public void getAnimales() {
	    	for (int i = 0; i < animales.size(); i++) {
	    	      System.out.println(animales.get(i));
	    	}
	 }
	 public void setAnimales(Animal animal) {
		animales.add(animal);
	 }
	 public int cantidadAnimales() {
		 return animales.size();	
	 }
}
