package untref.aydoo.graficador.tests;

import org.junit.Assert;
import org.junit.Test;
import untref.aydoo.graficador.FuncionLineal;

public class FuncionLinealTest {

	@Test
	public void evaluarEn4DeberiaRetornar11CuandoAEs2YBEs3() {

		float a = 2.0f;
		float b = 3.0f;
		float x = 4.0f;
		float resultado = 11.0f;

		FuncionLineal funcionLineal = new FuncionLineal(a, b);

		Assert.assertEquals(resultado, funcionLineal.evaluarEn(x), 0.0001);

	}

	@Test
	public void evaluarEn5DeberiaRetornar26CuandoAEs5YBEs1() {

		float a = 5.0f;
		float b = 1.0f;
		float x = 5.0f;
		float resultado = 26.0f;

		FuncionLineal funcionLineal = new FuncionLineal(a, b);

		Assert.assertEquals(resultado, funcionLineal.evaluarEn(x), 0.0001);

	}
	
	@Test
	public void evaluarEn0DeberiaRetornar5CuandoAEs2YBEs5() {

		float a = 2.0f;
		float b = 5.0f;
		float x = 0.0f;
		float resultado = 5.0f;

		FuncionLineal funcionLineal = new FuncionLineal(a, b);

		Assert.assertEquals(resultado, funcionLineal.evaluarEn(x), 0.0001);

	}
	@Test
	public void evaluarEnMenos4DeberiaRetornar11CuandoAEs2YBEs3() {

		float a = 2.0f;
		float b = 3.0f;
		float x = -4.0f;
		float resultado = -5.0f;

		FuncionLineal funcionLineal = new FuncionLineal(a, b);

		Assert.assertEquals(resultado, funcionLineal.evaluarEn(x), 0.0001);

	}
	@Test
	public void evaluarEn4DeberiaRetornarCuandoAEs0YBEsMenos3() {

		float a = 0.0f;
		float b = -3.0f;
		float x = 4.0f;
		float resultado = -3.0f;

		FuncionLineal funcionLineal = new FuncionLineal(a, b);

		Assert.assertEquals(resultado, funcionLineal.evaluarEn(x), 0.0001);

	}




}
