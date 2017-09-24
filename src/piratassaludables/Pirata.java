package piratassaludables;

public class Pirata {

	/*private int estado; //0: tiene escorbuto, 1: saludable, 2: hipersaludable
	private int cantGrog;*/
	
	private EstadoPirata estado;
	private int puntaje;
	
	public Pirata() {
		/*this.estado = 1;
		this.cantGrog = 0;*/
		this.puntaje = 0;
		this.estado = new Saludable();
	}
	
	public int getPuntaje() {
		return this.puntaje;
	}
	
	public void tomarGrog() {
		
		this.estado = this.estado.tomarGrog();
		
		/*if( this.estado == 2 )
		{
			this.estado = 1;
			return;
		}
		
		if( this.estado == 1 ) {
			
			this.cantGrog++;
			
			if( this.cantGrog > 2 )
			{
				this.estado = 0;
			}
		}*/
	}
	
	public void tomarJugo() {
		
		this.estado = this.estado.tomarJugo();
		
		/*this.cantGrog = 0;
		
		if(this.estado == 1) {
			
			this.estado = 2;
			return;
		}
		
		if(this.estado == 0)
			this.estado = 1;*/	
	}

	public void atacar( Pirata barbaNegra ) {
		
		this.puntaje += this.estado.atacar();
		
		/*switch(this.estado)
		{
		
		case 0: 
			this.puntaje += 2;
			break;
		
		case 1: 
			this.puntaje += 5;
			break;
		
		case 2: 
			this.puntaje += 10;
			break;
		}*/
		
		barbaNegra.defender();
	}

	public void defender() {
		
		this.puntaje += this.estado.defender();

		/*switch(this.estado)
		{
		
		case 1: 	
			this.puntaje += 2;
			break;
		
		case 2: 
			this.puntaje -= 2;
			break;
		}*/
	}

	public boolean esVencedor( Pirata barbaRoja ) {
		
		if( this.puntaje > barbaRoja.getPuntaje() )
			return true;
		
		return false;
	}

}
