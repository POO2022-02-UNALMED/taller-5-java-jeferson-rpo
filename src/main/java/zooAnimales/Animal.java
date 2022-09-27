package zooAnimales;

import java.util.ArrayList;


import gestion.Zona;


public class Animal {
	private int totalAnimales;
	 String nombre;
	 int edad;
	 String habitat;
	 String genero;
	private ArrayList<Zona> zonas= new ArrayList<>();
	private static int totalMamiferos;
	private static int totalAves;
	private static int totalReptiles;
	private static int totalPeces;
	private static int totalAnfibios;
	
	public Animal() {
		this(null,0,null,null);
	}
	
	public Animal (String nombre, int edad,String habitat, String genero) {
		this.nombre= nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;
		setTotalAnimales(getTotalAnimales() + 1);
		
	}
	public String movimiento() {
		String a="desplazarse";
		return a;
	}
	public static String totalPorTipo() {
		return "Mamiferos: "+ (Mamifero.caballos +Mamifero.leones) + "/nAves: " + (Ave.aguilas+Ave.halcones)+"/nReptiles: "+(Reptil.iguanas+Reptil.serpientes)+
				"/nPez: "+(Pez.bacalaos+Pez.salmones)+"/nAnfibio:"+(Anfibio.ranas+Anfibio.salamandras);
		}

	public ArrayList<Zona> getZonas() {
		return zonas;
	}

	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}

	public static int getTotalMamiferos() {
		return totalMamiferos;
	}

	public static void setTotalMamiferos(int totalMamiferos) {
		Animal.totalMamiferos = Animal.totalMamiferos+ totalMamiferos ;
	}

	public static int getTotalAves() {
		return totalAves;
	}

	public static void setTotalAves(int totalAves) {
		Animal.totalAves = Animal.totalAves+totalAves;
	}

	public static int getTotalReptiles() {
		return totalReptiles;
	}

	public static void setTotalReptiles(int totalReptiles) {
		Animal.totalReptiles = Animal.totalReptiles+ totalReptiles;
	}

	public static int getTotalPeces() {
		return totalPeces;
	}

	public static void setTotalPeces(int totalPeces) {
		Animal.totalPeces = Animal.totalPeces +totalPeces;
	}

	public static int getTotalAnfibios() {
		return totalAnfibios;
	}

	public static void setTotalAnfibios(int totalAnfibios) {
		Animal.totalAnfibios = Animal.totalAnfibios+ totalAnfibios;
	}
	public String getNombre() {
    	return nombre;
    	
	}
 
	public void setNombre (String nombre) {
    	this.nombre= nombre;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat= habitat;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad= edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero= genero;
	}

	public int getTotalAnimales() {
		return totalAnimales;
	}

	public void setTotalAnimales(int totalAnimales) {
		this.totalAnimales = totalAnimales;
	}
	public String toString() {
		if (this.zonas != null){
			return "Mi nombre es " + this.getNombre() + ",tengo una edad de " + this.getEdad() + ",habito en " + this.getHabitat() + "y mi genero es " +
				this.getGenero() + ",la zona en la que me ubico es " + this.getZonas() + ",en el " + Zona.getZoo().getNombre();
		}
		else {
			return "Mi nombre es " + this.getNombre() + ",tengo una edad de " + this.getEdad() + ",habito en " + this.getHabitat() + "y mi genero es " +
					this.getGenero();
		}
	}
		
}

	

