package pagamento;

import operadora.Operadora;

public interface ModuloPagamentoFactory {
    public Operadora criarOperadora();
}
