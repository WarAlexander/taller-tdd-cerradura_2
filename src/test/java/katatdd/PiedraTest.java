package katatdd;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class PiedraTest {

	private Figura piedra = new Piedra();
	@Test
	public void PiedraContraPiedraDeberiaSerEmpate()
	{		
		assertThat(piedra.contra(new Piedra())).isNull();
	}
	
	@Test
	public void PiedraContraPapelDeberiaSerPapel(){		
		assertThat(piedra.contra(new Papel())).isInstanceOf(Papel.class);
	}
	
	@Test
	public void PiedraContraTijeraDeperiaSerPiedra(){		
		assertThat(piedra.contra(new Tijera())).isInstanceOf(Piedra.class);
	}
}
