package leta.core.sample.generated;

public class CartaoInvalidoAdapterTest extends CartaoInvalidoTestOld {

    @Override
    TCOutput sendToSut(TCInput input) {
	
	System.out.println(input.whenCartaoTemNomePossuiSobrenomeAbc().getNome().getStringValue());
	System.out.println(input.whenCartaoTemNomePossuiSobrenomeAbc().getSobrenome().getStringValue());
	System.out.println(input.andCartaoTemVencimento().getVencimento().getDateValue());

	
	TCOutput result = new TCOutput();
	
	result.verifyCartaoNaoEValido(true);
	
	return result;
    }

}
