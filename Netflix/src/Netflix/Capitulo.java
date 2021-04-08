package Netflix;

import java.util.ArrayList;

public class Capitulo {
	protected int duracion;
	public final int DURACION = 45;
	protected int num;
	protected Temporada temporada;
	protected ArrayList<Personaje> personajes;

	public Capitulo() {
	}
	public Capitulo(int num, Temporada temporada) {
		this.num = num;
		this.temporada = temporada;
	}
	public String listaPersonajes() {
		//String cadena ="";
		StringBuilder sb=new StringBuilder();
		for (Personaje per:personajes) {
			//cadena+=per;
			sb.append(per); //Falta definir el toString en personaje.
		}
		return sb.toString();
	}
	public int getNum() {
		return num;
	}
}
