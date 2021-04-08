package Netflix;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
	private int numero;
	private List<Capitulo> capitulos;
	private Serie serie;
	
	public String listaCapitulos() {
		StringBuilder sb = new StringBuilder();
		String titulo=serie.getTitulo();
		for (Capitulo cap:capitulos) {
			sb.append(titulo+"T"+numero+"C"+cap.getNum());//Y definir el toString en temporada.
		}//TeenwolfT2C#
		return sb.toString();
	}
	
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	
	public Temporada(int numero, Serie serie) {
		this.numero = numero;
		this.serie = serie;
	}
	public Temporada() {
		capitulos = new ArrayList<Capitulo>();
	}
	public boolean addCapitulo(Capitulo capitulo) {
		if (!capitulos.contains(capitulo)) {
			capitulos.add(capitulo);
			//capitulo.setTemporada(this);
			return true;
		}
		else
			return false;
	}
	public String ListaCapitulos() {
		String pepe = "";
		for (Capitulo cap:capitulos) {
			pepe += cap.toString();
		}
		return pepe;
	}
}
