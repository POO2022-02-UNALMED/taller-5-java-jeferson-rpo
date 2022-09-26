package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado= new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		this(null,-1,null,null,null,false);
	}
	
	public Anfibio (String nombre, int edad,String habitat,String genero,String colorPiel,boolean venenoso) {
		super(nombre,edad,habitat,genero);
		this.setColorPiel(colorPiel);
		this.setVenenoso(venenoso);
		listado.add(this);
		setTotalAnfibios(1);	
	}
	
	public static Anfibio crearRana(String nombre, int edad,String genero) {
		String colorPiel = "rojo";
		boolean venenoso=true;
		String habitat= "selva";
		ranas++;	
		Anfibio rana= new Anfibio(nombre,edad,habitat,genero,colorPiel,venenoso);
		listado.add(rana);
		return rana;
	}
	

	public static Anfibio crearSalamandra(String nombre, int edad,String genero) {
		String colorPiel = "negro y amarillo";
		boolean venenoso=false;
		String habitat= "selva";
		salamandras++;
		Anfibio salamandra= new Anfibio(nombre,edad,habitat,genero,colorPiel,venenoso);
		listado.add(salamandra);
		return salamandra;
	}
	
	@Override
	public void movimiento() {
		System.out.println("saltar");
	}
	public void getListado() {
    	for (int i = 0; i < listado.size(); i++) {
    	      System.out.println(listado.get(i));
    	}
		}
	public void setListado(ArrayList<Anfibio> anfibios) {
		this.listado= anfibios;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
}

