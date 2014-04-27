import junit.framework.Assert;

import org.junit.Test;

public class CoordenadasDeUbicacionTest {

	@Test
	public void devolverCoordenadaXIgualA5SixEs5() {

		CoordenasDeUbicacion ubicacionAtraccion = new CoordenasDeUbicacion(5,
				76);
		int coordenadaX = ubicacionAtraccion.getCoordenadaX();

		Assert.assertEquals(5, coordenadaX);

	}

	@Test
	public void devolverCoordenadaXIgualA3SixEs3() {

		CoordenasDeUbicacion ubicacion = new CoordenasDeUbicacion(3, 76);
		int coordenadaX = ubicacion.getCoordenadaX();

		Assert.assertEquals(3, coordenadaX);

	}

	@Test
	public void devolverCoordenadaYIgualA76SiYEs76() {

		CoordenasDeUbicacion ubicacion = new CoordenasDeUbicacion(5, 76);
		int coordenadaY = ubicacion.getCoordenadaY();

		Assert.assertEquals(76, coordenadaY);
	}

	
}
