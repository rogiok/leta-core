package leta.core.sample.generated;

public class DescontoCompraAdaptadorTest extends DescontoCompraTest {

    @Override
    TCOutput sendToSut(TCInput input) {
	
	TCOutput output = new TCOutput();
	
	output.verifyPedidoTemDesconto(new Desconto(10));
	
	return output;
    }

}
