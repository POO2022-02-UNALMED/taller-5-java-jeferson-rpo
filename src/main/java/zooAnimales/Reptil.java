package zooAnimales;

import java.util.ArrayList;



public class Reptil  extends Animal{
	private static  ArrayList<Reptil> listado=new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int	largoCola;
	
	public Reptil() {
		this(null,-1,null,null,null,0);
	}
	public Reptil (String nombre, int edad,String habitat,String genero,String colorEscamas,int largoCola) {
		super(nombre,edad,habitat,genero);
		this.setColorEscamas(colorEscamas);
		this.setLargoCola(largoCola);
		listado.add(this);
		setTotalReptiles(1);	
	}
	public static Reptil crearIguana (String nombre, int edad,String genero) {
		String colorEscamas = "verde";
		int cantidadAletas=3;
		String habitat= "humedal";
		iguanas++;
		Reptil iguana= new Reptil(nombre,edad,habitat,genero,colorEscamas,cantidadAletas);
		listado.add(iguana);
		return iguana;
	}
	public static Reptil crearSerpiente (String nombre, int edad,String genero) {
		String colorEscamas = "blanco";
		int cantidadAletas=1;
		String habitat= "jungla";
		serpientes++;
		Reptil serpiente= new Reptil(nombre,edad,habitat,genero,colorEscamas,cantidadAletas);
		listado.add(serpiente);
		return serpiente;
	}
	
	

	public String movimiento() {
		return "reptar";
	}
	public void getListado() {
    	for (int i = 0; i < listado.size(); i++) {
    	      System.out.println(listado.get(i));
    	}
		}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
}
