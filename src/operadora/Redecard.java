package operadora;

import java.math.BigDecimal;

public class Redecard implements Operadora {

    Long codigoConfirmacao = -1L;

    @Override
    public void capturar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException {
        if (cartao.startsWith("1111")) {
            throw new CapturaNaoAutorizadaException("Número inválido");
        }

        this.codigoConfirmacao = (long) Math.random() * 500;
    }

    @Override
    public Long confirmar() {
        System.out.println("Fazendo débito Redecard");
        return codigoConfirmacao;
    }
}
