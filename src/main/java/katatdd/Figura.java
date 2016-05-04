package katatdd;

public interface Figura {

	Figura contra(Tijera tijera);

	Figura contra(Papel papel);

	Figura contra(Piedra piedra);

}
