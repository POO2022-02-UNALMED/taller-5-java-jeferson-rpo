package gestion;
import java.util.ArrayList;

import zooAnimales.Animal;


public class Zona {
	private String nombre;
	private Zoologico zoo;	
	private ArrayList<Animal> animales= new ArrayList<>();
	
	

	public Zona() {
		this(null,null);
	 
	}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre=nombre;
		this.zoo= zoo;
	}	
	
	public void agregarAnimal (Animal animal) { 
		
    	animales.add(animal);	    					
	 }
	
	 public String getNombre() {
	    	return nombre;
	    	
	 }
	 
	 public void setNombre (String nombre) {
	    	this.nombre= nombre;
	 }
	 
	 public Zoologico getZoo() {
	    	return zoo;
	    	
	 }
	 
	 public void setZoo (Zoologico zoo) {
	    	this.zoo= zoo;
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
