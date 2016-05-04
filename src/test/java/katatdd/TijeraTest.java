package katatdd;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class TijeraTest {
	private Figura tijera = new Tijera();
	@Test
	public void tijeraContraTijeraDberiaSerEmpate(){	
		assertThat(tijera.contra(new Tijera())).isNull();
	}
	
	@Test
	public void tijeraContraPiedraDeberiaSerPiedra(){		
		assertThat(tijera.contra(new Piedra())).isInstanceOf(Piedra.class);
	}
	
	@Test
	public void tijeraContraPapelDeberiaSerTijera(){		
		assertThat(tijera.contra(new Papel())).isInstanceOf(Tijera.class);
	}
}
