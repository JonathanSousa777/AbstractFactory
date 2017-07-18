package debito;

import java.math.BigDecimal;
import operadora.CapturaNaoAutorizadaException;
import pagamento.ModuloPagamentoFactory;
import pagamento.CieloFactory;
import pagamento.Pagamento;
import pagamento.RedecardFactory;

public class MainFactory {

    public static void main(String[] args) throws CapturaNaoAutorizadaException {
        ModuloPagamentoFactory cielo = new CieloFactory();
        Pagamento pagamentoCielo = new Pagamento(cielo);

        //pagamentoCielo.autorizar("7777", new BigDecimal(400));
        
        ModuloPagamentoFactory redecard = new RedecardFactory();
        Pagamento pagamentoRedecard = new Pagamento(redecard);

        pagamentoRedecard.autorizar("2222", new BigDecimal(2000));
    }
}
