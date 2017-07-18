package operadora;

import java.math.BigDecimal;

public class Cielo implements Operadora{

    private Long codigoConfirmacao = -1L;

    @Override
    public void capturar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException {
        if (cartao.startsWith("5555")) {
            throw new CapturaNaoAutorizadaException("Número cartão inválido!");
        }

        this.codigoConfirmacao = (long) Math.random() * 1000;
    }

    @Override
    public Long confirmar() {
        System.out.println("Fazendo débito Cielo");
        return this.codigoConfirmacao;
    }
}