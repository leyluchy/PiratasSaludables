package piratassaludables;

import org.junit.Test;
import org.junit.Assert;

public class TestPirata {

	@Test
	public void ataqueTest() {
		
		Pirata barbaRoja = new Pirata(); 
		Pirata barbaNegra = new Pirata(); 
		
		barbaNegra.atacar(barbaRoja);
		Assert.assertEquals(5, barbaNegra.getPuntaje());
		barbaNegra.atacar(barbaRoja);
		Assert.assertEquals(10, barbaNegra.getPuntaje());
	}
	
	@Test
	public void defensaTest() {
		
		Pirata barbaRoja = new Pirata(); 
		Pirata barbaNegra = new Pirata(); 
		
		barbaNegra.atacar(barbaRoja);
		Assert.assertEquals(2, barbaRoja.getPuntaje());
		barbaNegra.atacar(barbaRoja);
		Assert.assertEquals(4, barbaRoja.getPuntaje());
	}

	@Test
	public void tomarGrogTest() {

		Pirata barbaRoja = new Pirata(); 
		Pirata barbaNegra = new Pirata(); 
		
		barbaNegra.tomarGrog();
		barbaRoja.tomarGrog();
		barbaNegra.atacar(barbaRoja);
		Assert.assertEquals(5, barbaNegra.getPuntaje());
		Assert.assertEquals(2, barbaRoja.getPuntaje());
		
		barbaNegra.tomarGrog();
		barbaRoja.tomarGrog();
		barbaNegra.atacar(barbaRoja);
		Assert.assertEquals(10, barbaNegra.getPuntaje());
		Assert.assertEquals(4, barbaRoja.getPuntaje());
		
		barbaNegra.tomarGrog();
		barbaRoja.tomarGrog();
		barbaNegra.atacar(barbaRoja);
		Assert.assertEquals(12, barbaNegra.getPuntaje());
		Assert.assertEquals(4, barbaRoja.getPuntaje());
		
		barbaNegra.tomarGrog();
		barbaRoja.tomarGrog();
		barbaNegra.atacar(barbaRoja);
		Assert.assertEquals(14, barbaNegra.getPuntaje());
		Assert.assertEquals(4, barbaRoja.getPuntaje());
		
		barbaNegra.tomarJugo();
		barbaRoja.tomarJugo();
		barbaNegra.atacar(barbaRoja);
		Assert.assertEquals(19, barbaNegra.getPuntaje());
		Assert.assertEquals(6, barbaRoja.getPuntaje());
	}
	
	@Test
	public void tomarJugoTest() {
		
		Pirata barbaRoja = new Pirata(); 
		Pirata barbaNegra = new Pirata(); 
		
		barbaNegra.tomarJugo();
		barbaRoja.tomarJugo();
		barbaNegra.atacar(barbaRoja);
		Assert.assertEquals(10, barbaNegra.getPuntaje());
		Assert.assertEquals(-2, barbaRoja.getPuntaje());
		
		barbaNegra.tomarJugo();
		barbaRoja.tomarJugo();
		barbaNegra.atacar(barbaRoja);
		Assert.assertEquals(20, barbaNegra.getPuntaje());
		Assert.assertEquals(-4, barbaRoja.getPuntaje());
		
		barbaNegra.tomarGrog();
		barbaRoja.tomarGrog();
		barbaNegra.atacar(barbaRoja);
		Assert.assertEquals(25, barbaNegra.getPuntaje());
		Assert.assertEquals(-2, barbaRoja.getPuntaje());
		
	}
	
	@Test
	public void ganadorTest() {
		
		Pirata barbaRoja = new Pirata(); 
		Pirata barbaNegra = new Pirata(); 
		barbaNegra.atacar(barbaRoja);
		barbaNegra.atacar(barbaRoja);
		barbaRoja.atacar(barbaNegra);
		Assert.assertEquals(true, barbaNegra.esVencedor(barbaRoja));
		Assert.assertEquals(false, barbaRoja.esVencedor(barbaNegra));
		Assert.assertEquals(false, barbaRoja.esVencedor(barbaRoja));
	}
}
