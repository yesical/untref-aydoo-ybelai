public class CoordenasDeUbicacion {

	private int coordenadaX;
	private int coordenadaY;
	
	public CoordenasDeUbicacion(int x, int y) {
		
		this.coordenadaX = x;
		this.coordenadaY = y;

	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
	public boolean mismaCoordenada(CoordenasDeUbicacion otraCordenada){
		if (otraCordenada.getCoordenadaX()==coordenadaX && otraCordenada.getCoordenadaY()==coordenadaY){
			return true;
			
		} else{
			return false;
		}
		
	}
	

}
