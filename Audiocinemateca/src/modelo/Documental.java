package modelo;

import java.util.List;

public class Documental {
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
	private final String FILMAFFINITY;
	private final String SINOPSIS;
	private final List<String> enlace;
	
	public Documental(String id, String titulo, String anyo, String genero, String pais, String director, String guion, String musica, String fotografia, String reparto, String productora, String narracion, int duracion, String idioma, String filmaffinity, String sinopsis, List<String> enlace) {
		super();
		this.ID = id;
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
		this.FILMAFFINITY = filmaffinity;
		this.SINOPSIS = sinopsis;
		this.enlace = enlace;
	} // Fin del constructor de la clase Documental.

} // Fin de la clase Documental.
