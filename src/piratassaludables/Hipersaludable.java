package piratassaludables;

public class Hipersaludable implements EstadoPirata {
	public Hipersaludable() {
		
	}
	
	@Override
	public EstadoPirata tomarGrog() {
		return new Saludable();
	}

	@Override
	public EstadoPirata tomarJugo() {
		return this;
	}

	@Override
	public int atacar() {
		return 10;
	}

	@Override
	public int defender() {
		return -2;
	}
}
