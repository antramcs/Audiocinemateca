package modelo;

public class Serie {
	private final String ID;
	private final String TITULO;
	private final String ANYO;
	private final int DURACION;
	private final String PAIS;
	private final String DIRECTOR;
	private final String GUION;
	private final String MUSICA;
	private final String FOTOGRAFIA;
	private final String REPARTO;
	private final String GENERO;
	private final int TEMPORADAS;
	private String IDIOMA;
	private final String NARRACION;
	private final String FILMAFFINITY;
	private final String SINOPSIS;
	private final String PRODUCTORA;
	private final Temporada TEMPORADA;
	
	public Serie(String id, String titulo, String anyo, int duracion, String pais, String director, String guion, String musica, String fotografia, String reparto, String genero, int temporadas, String idioma, String narracion, String filmaffinity, String sinopsis, String productora, Temporada temporada) {
		super();
		this.ID = id;
		this.TITULO = titulo;
		this.ANYO = anyo;
		this.DURACION = duracion;
		this.PAIS = pais;
		this.DIRECTOR = director;
		this.GUION = guion;
		this.MUSICA = musica;
		this.FOTOGRAFIA = fotografia;
		this.REPARTO = reparto;
		this.GENERO = genero;
		this.TEMPORADAS = temporadas;
		this.IDIOMA = idioma;
		this.NARRACION = narracion;
		this.FILMAFFINITY = filmaffinity;
		this.SINOPSIS = sinopsis;
		this.PRODUCTORA = productora;
		this.TEMPORADA = temporada;
	} // Fin del constructor de la clase Serie.
	
	public String getId() {
		return this.ID;
	} // Fin del método getId.
	
	public String getTitulo() {
		return this.TITULO;
	} // Fin del método getTitulo.
	
	public String getAnyo() {
		return this.ANYO;
	} // Fin del método getAnyo.
	
	public int getDuracion() {
		return this.DURACION;
	} // Fin del método getDuracion.
	
	public String getPais() {
		return this.PAIS;
	} // Fin del método getPais.
	
	public String getDirector() {
		return this.DIRECTOR;
	} // Fin del método getDirector.
	
	public String getGuion() {
		return this.getGuion();
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
	
	public String getGenero() {
		return this.GENERO;	
	} // Fin del método getGenero.
	
	public int getTemporadas() {
		return this.TEMPORADAS;
	} // Fin del método getTemporadas.
	
	public String getIdioma() {
		return this.IDIOMA;
	} // Fin del método getIdioma.
	
	public String getNarracion() {
		return this.NARRACION;
	} // Fin del método getNarracion.
	
	public String getFilmaffinity() {
		return this.FILMAFFINITY;
	} // Fin del método getFilmaffinity.
	
	public String getSinopsis() {
		return this.SINOPSIS;
	} // Fin del método getSinopsis.
	
	public String getProductora() {
		return this.PRODUCTORA;
	} // Fin del método getProductora.
	
	public Temporada getTemporada() {
		return thiS.TEMPORADA;
	} // Fin del método getCapitulos.

} // Fin de la clase Serie.
