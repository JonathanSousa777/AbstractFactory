package operadora;

public class CapturaNaoAutorizadaException extends Exception{

    public CapturaNaoAutorizadaException(String erro) {
        super(erro);
    }
}
