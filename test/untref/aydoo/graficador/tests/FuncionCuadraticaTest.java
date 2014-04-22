package untref.aydoo.graficador.tests;

import org.junit.Assert;
import org.junit.Test;

import untref.aydoo.graficador.FuncionCuadratica;

public class FuncionCuadraticaTest {
	
	@Test
	public void evaluarEn(){
		
		float a = 1.0f;
		float b = 2.0f;
		float c = 3.0f;
		float x = 4.0f;
		float resultado = 27.0f;
		
			
		FuncionCuadratica funcionCuadratica = new FuncionCuadratica(a,b,c);
		Assert.assertEquals(resultado, funcionCuadratica.evaluarEn(x), 0.00001);
		
		
		
		
		
	}

}
