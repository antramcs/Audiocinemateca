package modelo;

import java.util.List;

public class Temporada {
	private final int TEMPORADA;
	private final List<Capitulo> capitulos;
	
	public Temporada(int temporada, List<Capitulo> capitulos) {
		super();
		this.TEMPORADA = temporada;
		this.capitulos = capitulos;
	} // Fin del constructor de la clase Temporada.
	
	public int getTemporada() {
		return this.TEMPORADA;
	} // Fin del método getTemporada.
		
	public List<Capitulo> getCapitulos() {
		return this.capitulos;
	} // Fin del método getCapitulos.

} // Fin de la clase Temporada.
