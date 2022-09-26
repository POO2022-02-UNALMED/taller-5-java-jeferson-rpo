package zooAnimales;

import java.util.ArrayList;
//overrides ponerlo
public class Ave  extends Animal {
	private static  ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
		this(null,-1,null,null,null);
	}
	public Ave (String nombre, int edad,String habitat,String genero,String colorPlumas) {
		super(nombre,edad,habitat,genero);
		this.colorPlumas=colorPlumas;
		listado.add(this);
		setTotalAves(1);
	}
	public static Ave crearHalcon (String nombre, int edad,String genero) {
		String colorPlumas = "cafe glorioso";
		String habitat= "montañas";
		halcones++;
		Ave Halcon= new Ave(nombre,edad,habitat,genero,colorPlumas);
		listado.add(Halcon);
		return Halcon;
	}
	public static Ave crearAguila (String nombre, int edad,String genero) {
		String colorPlumas = "blanco y amarillo";
		String habitat= "montañas";
		aguilas++;
		Ave aguila= new Ave(nombre,edad,habitat,genero,colorPlumas);
		listado.add(aguila);
		return aguila;
	}
	@Override
	public void movimiento() {
		System.out.println("volar");
	}
	public void getListado() {
    	for (int i = 0; i < listado.size(); i++) {
    	      System.out.println(listado.get(i));
    	}
		}
	public void setListado(ArrayList<Ave> aves) {
		this.listado= aves;
	}
}