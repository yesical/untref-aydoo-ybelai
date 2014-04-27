import junit.framework.Assert;

import org.junit.Test;


public class EnumTipoDeAtraccionTest {
	@Test
	public void devolverTipoDeAtraccionAventura() {

		Atraccion atraccion1 = new Atraccion(20, 30, 24, 10, 400,
				TipoDeAtraccion.AVENTURA);

		Assert.assertEquals(TipoDeAtraccion.AVENTURA,
				atraccion1.getTipoDeAtraccion());
	}

}
