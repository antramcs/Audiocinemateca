package modelo;

import java.util.List;

public class Pelicula {
	private final String ID;
	private final String TITULO;
	private final String ANYO;
	private final String GENERO;
	private final String PAIS;
	private final String DIRECTOR;
	private final String GUION;
	private final String MUSICA;
	private final String FOTOGRAFIA;
	private final String REPARTO;
	private final String PRODUCTORA;
	private final String NARRACION;
	private final int DURACION;
	private final String IDIOMA;
	private final int PARTES;
	private final String FILMAFFINITY;
	private final String SINOPSIS;
	private final List<String> ENLACES;
	
	public Pelicula(String iD, String titulo, String anyo, String genero, String pais, String director, String guion,
			String musica, String fotografia, String reparto, String productora, String narracion, int duracion,
			String idioma, int partes, String filmaffinity, String sinopsis, List<String> enlaces) {
		super();
		this.ID = iD;
		this.TITULO = titulo;
		this.ANYO = anyo;
		this.GENERO = genero;
		this.PAIS = pais;
		this.DIRECTOR = director;
		this.GUION = guion;
		this.MUSICA = musica;
		this.FOTOGRAFIA = fotografia;
		this.REPARTO = reparto;
		this.PRODUCTORA = productora;
		this.NARRACION = narracion;
		this.DURACION = duracion;
		this.IDIOMA = idioma;
		this.PARTES = partes;
		this.FILMAFFINITY = filmaffinity;
		this.SINOPSIS = sinopsis;
		this.ENLACES = enlaces;
	} // Fin del constructor de la clase Pelicula.
	
	public String getId() {
		return this.ID;
	} // Fin del método getId.
	
	public String getTitulo() {
		return this.TITULO;
	} // Fin del método getTitulo.
	
	public String getAnyo() {
		return this.ANYO;
	} // Fin del método getAnyo.
	
	public String getGenero() {
		return this.GENERO;
	} // Fin del método getGenero.
	
	public String getPais() {
		return this.PAIS;
	} // Fin del método getPais.
	
	public String getDirector() {
		return this.DIRECTOR;
	} // Fin del método getDirector.
	
	public String getGuion() {
		return this.GUION;
	} // Fin del método getGuion.
	
	public String getMusica() {
		return this.MUSICA;
	} // Fin del método getMusica.
	
	public String getFotografia() {
		return this.FOTOGRAFIA;
	} // Fin del método getFotografia.
	
	public String getReparto() {
		return this.REPARTO;
	} // Fin del método getReparto.
	
	public String getProductora() {
		return this.PRODUCTORA;
	} // Fin del método getProductora.
	
	public String getNarracion() {
		return this.NARRACION;
	} // Fin del método getNarracion.
	
	public int getDuracion() {
		return this.DURACION;
	} // Fin del método getDuracion.
	
	public String getIdioma() {
		return this.IDIOMA;
	} // Fin del método getIdioma.
	
	public int getPartes() {
		return this.PARTES;
	} // Fin del método getPartes.
	
	public String getFilmaffinity() {
		return this.FILMAFFINITY;
	} // Fin del método getFilmaffinity.
	
	public String getSinopsis() {
		return this.SINOPSIS;
	} // Fin del método getSinopsis.
	
	public List<String> getEnlaces() {
		return this.ENLACES ;
	} // Fin del método getEnlaces.

} // Fin de la clase Pelicula.
