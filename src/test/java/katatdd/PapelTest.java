package katatdd;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class PapelTest {
	
	private Figura papel = new Papel();
	@Test
	public void PapelContraTijeraDeberiaSerTijera(){		
		assertThat(papel.contra(new Tijera())).isInstanceOf(Tijera.class);
	}
	
	@Test
	public void PapelContraPapelDeberiaSerEmpate()
	{		
		assertThat(papel.contra(new Papel())).isNull();
	}
	
	@Test
	public void PapelContraPiedraDeberiaSerPapel()
	{		
		assertThat(papel.contra(new Piedra())).isInstanceOf(Papel.class);
	}
}
