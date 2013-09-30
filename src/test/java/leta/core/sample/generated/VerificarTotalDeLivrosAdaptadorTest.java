package leta.core.sample.generated;

public class VerificarTotalDeLivrosAdaptadorTest extends VerificarTotalDeLivrosTest {

    @Override
    TCOutput sendToSut(TCInput input) {
	
	input.whenLivroPossuiQuantidade().getLivro().stringValue();
	input.whenLivroPossuiQuantidade().getQuantidade().intValue();
	
	TCOutput result = new TCOutput();
	
	result.andCestaTemLivro(new Livro("Livro A"));
	result.verifyCestaTemTotal(new Total(10));
	
	return result;
    }

}
