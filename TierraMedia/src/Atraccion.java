enum TipoDeAtraccion{
	PAISAJE, AVENTURA, DEGUSTACION}
	

public class Atraccion {

	private CoordenasDeUbicacion ubicacion;
	private double costo;
	private int tiempo;
	private int cupoDeVisita;
	private TipoDeAtraccion tipoDeAtraccion ;
	
	public Atraccion(int posicionX, int posicionY, double costo, int tiempo, int cupoDeVisita, TipoDeAtraccion tipoDeAtraccion){
		this.costo = costo;
		this.tiempo = tiempo;
		this.cupoDeVisita = cupoDeVisita;
		this.ubicacion = new CoordenasDeUbicacion(posicionX, posicionY);	
		this.tipoDeAtraccion = tipoDeAtraccion;		
	}

	public int  getPosicionXAtraccion(){
		return ubicacion.getCoordenadaX();
	}
	public int  getPosicionYAtraccion(){
		return ubicacion.getCoordenadaY();
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public int getCupoDeVisita() {
		return cupoDeVisita;
	}

	public void setCupoDeVisita(int cupoDeVisita) {
		this.cupoDeVisita = cupoDeVisita;
	}

	public TipoDeAtraccion getTipoDeAtraccion() {
		return tipoDeAtraccion;
	}

	public void setTipoDeAtraccion(TipoDeAtraccion tipoDeAtraccion) {
		this.tipoDeAtraccion = tipoDeAtraccion;
	}
	
	



}
