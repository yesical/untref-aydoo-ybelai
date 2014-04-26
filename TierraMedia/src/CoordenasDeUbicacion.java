public class CoordenasDeUbicacion {

	private double[] coordenadas;

	public void coordenadasAtraccion(double x, double y) {
		coordenadas = new double[2];
		coordenadas[0] = x;
		coordenadas[1] = y;

	}

	public double UbicacionAtraccion() {

		for (int i = 0; i < 2; i++) {
			
				System.out.println("Coordenada en X:");
				System.out.println(coordenadas[0]);
		
				System.out.println("Coordenada en Y:");
				System.out.println(coordenadas[1]);

			}

		
		return coordenadas[2];
	}

}
