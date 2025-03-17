package CinePK;

public class Cine {
	
	int aforo;
	int butacasOcupadas;
	double precioEntrada;
	String tituloPelicula;
	
	/**
	 * Constructor vacío,
	 * valores predeterminados:
	 * aforo de 100
	 * 0 butacas ocupadas,
	 * precio de entrada de 5 euros,
	 * título de película "Sin determinar"
	 */
	public Cine() {
	    this(100);
	}

	/**
	 * Constructor con 1 parámetro,
	 * valores predeterminados:
	 * 0 butacas ocupadas,
	 * precio de entrada de 5 euros,
	 * título de película "Sin determinar"
	 * @param aforo int
	 */
	public Cine(int aforo) {
	    this(aforo, 5, "Sin determinar");
	}


	/**
	 * Constructor con 3 parámetros,
	 * valor predeterminado:
	 * 0 butacas ocupadas
	 * @param aforo int
	 * @param precioEntrada double
	 * @param tituloPelicula String
	 */
	public Cine(int aforo, double precioEntrada, String tituloPelicula) {
	    super();
	    this.aforo = aforo;
	    this.precioEntrada = precioEntrada;
	    this.tituloPelicula = tituloPelicula;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	public int getButacasOcupadas() {
		return butacasOcupadas;
	}

	public void setButacasOcupadas(int butacasOcupadas) {
		this.butacasOcupadas = butacasOcupadas;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public String getTituloPelicula() {
		return tituloPelicula;
	}

	public void setTituloPelicula(String tituloPelicula) {
		this.tituloPelicula = tituloPelicula;
	}
	
	
	/**
	 * Devuelve el número de butacas libres en la sala.
	 * @return int - Número de butacas libres
	 */
	public int butacasLibres() {
	    return aforo - butacasOcupadas;
	}

	/**
	 * Devuelve el porcentaje de ocupación de la sala.
	 * @return double - Porcentaje de butacas ocupadas
	 */
	public double porcentajeOcupacion() {
	    return (butacasOcupadas / (double) aforo) * 100;
	}
	
	/**
	 * Devuelve los ingresos totales de la sala.
	 * Calculado como el número de butacas ocupadas por el precio de la entrada.
	 * @return double - Ingresos totales
	 */
	public double ingresosSala() {
	    return butacasOcupadas * precioEntrada;
	}

	/**
	 * Vacía la sala, poniendo a cero las butacas ocupadas.
	 */
	public void vaciarSala() {
	    butacasOcupadas = 0;
	}
	
	/**
	 * Vende una entrada incrementando en 1 el número de butacas ocupadas a menos que la sala este llena.
	 * @return boolean - true si se ha vendido, false si no
	 */
	public boolean venderEntrada() {
	    if (butacasOcupadas < aforo) {
	        butacasOcupadas++;
	        return true;
	    }
	    return false;
	}
	
}
