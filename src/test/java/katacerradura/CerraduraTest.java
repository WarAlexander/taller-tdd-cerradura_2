package katacerradura;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class CerraduraTest {
	
	@Test
	public void VerificarSiAbreLaCerradura()
	{		
		Cerradura cerradura= new Cerradura(1234,5);
		assertThat(cerradura.abrir(1234)).isEqualTo(true);		
	}
	
	@Test
	public void VerificarSiLaCerraduraEstaAbierta(){
		Cerradura cerradura= new Cerradura(1234,5);
		cerradura.abrir(1234);
		assertThat(cerradura.estaAbierta()).isEqualTo(true);
	}
	
	@Test
	public void VerificarSiLaCerraduraEstaCerrada(){
		Cerradura cerradura= new Cerradura(12345,5);
		cerradura.abrir(1234);
		assertThat(cerradura.estaAbierta()).isEqualTo(false);
	}
	
	@Test
	public void VerificarSiLaCerraduraSeCierra(){
		Cerradura cerradura= new Cerradura(1234,5);
		cerradura.abrir(1234);		
		cerradura.cerrar();
		assertThat(cerradura.estaAbierta()).isEqualTo(false);
	}
	
	@Test
	public void VerificarSiLaCerraduraFueBloqueada(){
		Cerradura cerradura= new Cerradura(1234,5);
		for (int i = 0; i < 5; i++) {
			cerradura.abrir(2222);		
		}
		assertThat(cerradura.estaBloqueada()).isEqualTo(true);
		assertThat(cerradura.abrir(1234)).isEqualTo(false);
	}
	
}
