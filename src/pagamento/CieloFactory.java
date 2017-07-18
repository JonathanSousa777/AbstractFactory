package pagamento;

import operadora.Cielo;
import operadora.Operadora;

public class CieloFactory implements ModuloPagamentoFactory{

    @Override
    public Operadora criarOperadora() {
        return new Cielo();
    }
}
