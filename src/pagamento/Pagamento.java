package pagamento;

import java.math.BigDecimal;
import operadora.CapturaNaoAutorizadaException;
import operadora.Operadora;

public class Pagamento {

    private Operadora operadora;

    public Pagamento(ModuloPagamentoFactory moduloPagamentoFactory) {
        this.operadora = moduloPagamentoFactory.criarOperadora();
    }

    public Long autorizar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException {
        this.operadora.capturar(cartao, valor);
        return this.operadora.confirmar();
    }
}
