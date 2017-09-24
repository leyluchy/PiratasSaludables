package piratassaludables;

public class Saludable implements EstadoPirata{
	int cantGrog;
	
	public Saludable() {
		this.cantGrog = 0;
	}
	@Override
	public EstadoPirata tomarGrog() {
		if(++cantGrog == 3)
			return new Escorbuto();
		return this;
	}

	@Override
	public EstadoPirata tomarJugo() {
		return new Hipersaludable();
	}

	@Override
	public int atacar() {
		return 5;
	}

	@Override
	public int defender() {
		return 2;
	}
	
}
