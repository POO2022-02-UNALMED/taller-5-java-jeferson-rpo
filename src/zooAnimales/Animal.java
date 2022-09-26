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
		totalAnimales++;
		
	}
	public void movimiento() {
		System.out.println("desplazarse");
	}
	public String totalPorTipo() {
		return "Mamiferos:"+ (Mamifero.caballos +Mamifero.leones) + "/nAves:" + (Ave.aguilas+Ave.halcones)+"/nReptiles:"+(Reptil.iguanas+Reptil.serpientes)+
				"/nPez:"+(Pez.bacalaos+Pez.salmones)+"/nAnfibio:"+(Anfibio.ranas+Anfibio.salamandras);
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
}

	

