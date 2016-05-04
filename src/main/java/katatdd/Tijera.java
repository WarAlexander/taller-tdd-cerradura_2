package katatdd;


public class Tijera implements Figura {

	public Figura contra(Tijera tijera) {
		// TODO Auto-generated method stub
		return null;
	}

	public Figura contra(Piedra piedra) {
		// TODO Auto-generated method stub
		return piedra;
	}

	public Figura contra(Papel papel) {
		// TODO Auto-generated method stub
		return this;
	}

}
