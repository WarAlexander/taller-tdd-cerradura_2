package katacerradura;

import org.assertj.core.api.AbstractBooleanAssert;

public class Cerradura {

	private Integer clave;
	private boolean estaAbierta;
	private boolean estaBloqueada = false;
	private Integer cantidadDeFallosConsecutivosQueLaBloquean;
	private Integer contadorDeFallos = 0;
	
	public Cerradura(Integer clave, int cantidadDeFallosConsecutivosQueLaBloquean) {
		this.clave = clave;
		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
	}

	public boolean abrir(Integer claveI) {	
		if(this.estaBloqueada == true){
			return false;
		}
		if(this.clave.equals(claveI)){
			this.estaAbierta = true;
			this.contadorDeFallos = 0;
		}else{
			this.estaAbierta = false;
			this.contadorDeFallos++;
		}
		if	(this.contadorDeFallos>=cantidadDeFallosConsecutivosQueLaBloquean){
			this.estaBloqueada = true;
		}

		return this.estaAbierta;
	}

	public boolean estaAbierta() {
		return this.estaAbierta;
	}

	public void cerrar() {
		// TODO Auto-generated method stub
		this.estaAbierta = false;
	
	}

	public boolean estaBloqueada() {		
		return this.estaBloqueada;
	}

}
