package Netflix;

import java.util.List;
import java.util.ArrayList;

public class Serie {
	private String titulo;
	private List<Temporada> temporadas;
	
	public Serie(String titulo, List<Temporada> temporadas) {
		this.titulo = titulo;
		this.temporadas = new ArrayList<Temporada>();
	}
	public Serie(String titulo) {
		this.temporadas = new ArrayList<Temporada>();
	}
	public void addTemporada(Temporada temporada) {
		temporadas.add(temporada);
    	temporada.setSerie(this);
	}
	public String getTitulo() {
		return titulo;
	}
	
	public Serie() {
		super();
	}
	//No refactoring
	public void duraciontotalserie() {
		int duracion=0;
		for (Temporada temporada:temporadas) {
			ArrayList<Capitulo> capitulos = temporada.getCapitulos();
			for (Capitulo capitulo:capitulos) {
				duracion+=capitulo.getDuracion();
			}
		}
		System.out.println("La duracion de la serie es " + duracion);
	}
	//Refactoring
	
	public void duraciontotalseriecon() {
		int duracion=0;
		for (Temporada temporada:temporadas) {
				duracion+=temporada.getMinutosTemporada();
		}
		System.out.println("La duracion de la serie es " + duracion);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
