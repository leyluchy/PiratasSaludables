package piratassaludables;

public class Escorbuto implements EstadoPirata{
	public Escorbuto() {
		
	}
	
	@Override
	public EstadoPirata tomarGrog() {
		return this;
	}

	@Override
	public EstadoPirata tomarJugo() {
		return new Saludable();
	}

	@Override
	public int atacar() {
		return 2;
	}

	@Override
	public int defender() {
		return 0;
	}
}
