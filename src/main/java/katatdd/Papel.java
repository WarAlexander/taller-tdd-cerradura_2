package katatdd;

public class Papel implements Figura{

	public Figura contra(Papel papel) {
		// TODO Auto-generated method stub
		return null;
	}

	public Figura contra(Tijera tijera) {
		// TODO Auto-generated method stub
		return tijera;
	}

	public Figura contra(Piedra piedra) {
		// TODO Auto-generated method stub
		return this;
	}

}
