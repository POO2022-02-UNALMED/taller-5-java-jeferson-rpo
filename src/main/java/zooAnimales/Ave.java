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
		this.setColorPlumas(colorPlumas);
		listado.add(this);
		setTotalAves(1);
	}
	public static Ave crearHalcon (String nombre, int edad,String genero) {
		String colorPlumas = "cafe glorioso";
		String habitat= "montanas";
		halcones++;
		Ave Halcon= new Ave(nombre,edad,habitat,genero,colorPlumas);
		listado.add(Halcon);
		return Halcon;
	}
	public static Ave crearAguila (String nombre, int edad,String genero) {
		String colorPlumas = "blanco y amarillo";
		String habitat= "montanas";
		aguilas++;
		Ave aguila= new Ave(nombre,edad,habitat,genero,colorPlumas);
		listado.add(aguila);
		return aguila;
	}
	
	public String movimiento() {
		return "volar";
	}
	public void getListado() {
    	for (int i = 0; i < listado.size(); i++) {
    	      System.out.println(listado.get(i));
    	}
		}
	public void setListado(ArrayList<Ave> aves) {
		this.listado= aves;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
}
