package katatdd;

public class Piedra implements Figura{

	public Figura contra(Piedra piedra) {
		// TODO Auto-generated method stub
		return null;
	}

	public Figura contra(Papel papel) {
		// TODO Auto-generated method stub
		return papel;
	}

	public Figura contra(Tijera tijera) {
		// TODO Auto-generated method stub
		return this;
	}

}
