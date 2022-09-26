package zooAnimales;

import java.util.ArrayList;

public class Pez  extends Animal {
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		this(null,-1,null,null,null,0);
	}
	public Pez (String nombre, int edad,String habitat,String genero,String colorEscamas,int cantidadAletas) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas= cantidadAletas;
		listado.add(this);
		setTotalPeces(1);	
	}
	public static Pez crearSalmon (String nombre, int edad,String genero) {
		String colorEscamas = "rojo";
		int cantidadAletas=6;
		String habitat= "oceano";
		salmones++;
		Pez salmon= new Pez(nombre,edad,habitat,genero,colorEscamas,cantidadAletas);
		listado.add(salmon);
		return salmon;
	}
	public static Pez crearBacalao (String nombre, int edad,String genero) {
		String colorEscamas = "gris";
		int cantidadAletas=6;
		String habitat= "oceano";
		salmones++;
		Pez bacalao= new Pez(nombre,edad,habitat,genero,colorEscamas,cantidadAletas);
		listado.add(bacalao);
		return bacalao;
	}
	
	@Override
	public void movimiento() {
		System.out.println("nadar");
	}
	public void getListado() {
    	for (int i = 0; i < listado.size(); i++) {
    	      System.out.println(listado.get(i));
    	}
		}
	@SuppressWarnings("static-access")
	public void setListado(ArrayList<Pez> peces) {
		this.listado= peces;
	}
}