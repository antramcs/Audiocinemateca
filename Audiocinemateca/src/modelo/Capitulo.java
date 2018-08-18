package modelo;

public class Capitulo {
	private final int TEMPORADA;
	private final int CAPITULO;
	private final String TITULO;
	private final String ENLACE;
	
	public Capitulo(int temporada, int capitulo, String titulo, String enlace) {
		super();
		this.TEMPORADA = temporada;
		this.CAPITULO = capitulo;
		this.TITULO = titulo;
		this.ENLACE = enlace;
	} // Fin del constructor de la clase Capitulo.
	
	/**
	 * @return el número de temporada al que pertenece el capítulo.
	 */
	public int getTemporada() {
		return this.TEMPORADA;
	} // Fin del método getTemporada.
	
	/**
	 * @return el número del capítulo dentro de la temporada.
	 */
	public int getCapitulo() {
		return this.CAPITULO;
	} // Fin del método getCapitulo.
	
	/**
	 * @return el título del capítulo.
	 */
	public String getTitulo() {
		return this.TITULO;
	} // Fin del método getTitulo.
	
	/**
	 * @return el enlace del capítulo.
	 */
	public String getEnlace() {
		return this.ENLACE;
	} // Fin del método getEnlace.

} // Fin de la clase Capitulo.
