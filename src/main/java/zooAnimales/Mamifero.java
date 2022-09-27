package zooAnimales;
import java.util.ArrayList;


public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado= new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	
	public Mamifero() {
		this(null,-1,null,null,false,0);
	}
	public Mamifero (String nombre, int edad,String habitat,String genero,boolean pelaje,int patas) {
		super(nombre,edad,habitat,genero);
		this.pelaje=pelaje;
		this.patas= patas;
		listado.add(this);
		setTotalMamiferos(1);
	}
	public static Mamifero crearCaballo (String nombre, int edad,String genero) {
		boolean pelaje = true;
		int patas=4;
		String habitat= "pradera";
		caballos++;
		Mamifero caballo= new Mamifero(nombre,edad,habitat,genero,pelaje,patas);
		listado.add(caballo);
		return caballo;
	}
	
	public static Mamifero crearLeon (String nombre, int edad,String genero) {
		boolean pelaje = true;
		int patas=4;
		String habitat= "selva";
		leones++;
		Mamifero leon= new Mamifero(nombre,edad,habitat,genero,pelaje,patas);
		listado.add(leon);
		return leon;
	}
	
	public int cantidadMamiferos() {
		return listado.size();
	}
	public void getListado() {
    	for (int i = 0; i < listado.size(); i++) {
    	      System.out.println(listado.get(i));
    	}
		}
	
	public boolean isPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje= pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPelaje(int patas) {
		this.patas= patas;
	}
		
}
