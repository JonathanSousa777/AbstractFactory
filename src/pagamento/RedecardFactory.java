package pagamento;

import operadora.Operadora;
import operadora.Redecard;

public class RedecardFactory implements ModuloPagamentoFactory{

    @Override
    public Operadora criarOperadora() {
        return new Redecard();
    }
    
}
