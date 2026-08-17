interface Conta {       // INTERFACE
    void depositar(double valor);
}

class ContaBancaria implements Conta {  //CLASSE
    protected double saldo; //Atributo SALDO
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado. Saldo: R$ " + saldo);
    }
}

class ContaPoupanca extends ContaBancaria { // HERANÇA A herança aparece no "extends ContaBancaria"
}

class ContaCorrente extends ContaBancaria {
    @Override  // SOBRESCRITA 
    public void depositar(double valor)    //  ENCAPSULAMENTO 
    
    { 
        super.depositar(valor - 1.00);
        System.out.println("Foi descontada uma taxa de R$ 1,00.");
    }
}

public class Main {
    public static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente(); //  CRIAÇÃO DE OBJETO 
        corrente.depositar(100.00);
    }
}
