class SaldoInsuficienteException extends RuntimeException {     //excecao unchecked
    private static final long serialVersionUID = 1L;

    public SaldoInsuficienteException(String mensagem) {    //excecao customizada
        super(mensagem);
    }
}


class ContaBancaria {
protected double saldo;
public void depositar(double valor) {
saldo += valor;
}
public void sacar(double valor) {
if (valor > saldo) {
throw new SaldoInsuficienteException("Saldo insuficiente"); //THROW
}
saldo -= valor;
}
}
public class Exemplo02 {
public static void main(String[] args) {
ContaBancaria conta = new ContaBancaria();
conta.depositar(100.00);
try {            //try/catch
conta.sacar(500.00);
} catch (SaldoInsuficienteException excecao) {
System.out.println("Erro: " + excecao.getMessage());
}
System.out.println("Saldo final: " + conta.saldo);
}
}
