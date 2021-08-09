package Ex04;

public class Main {

    public static void main(String[] args) {

        ContaCorrente contaCorrente =  new ContaCorrente(12345, "Miguel Reis", 1000);

        ContaPoupanca contaPoupanca = new ContaPoupanca(54321, "Paulo Silva", 1000);

        contaCorrente.rendimento(contaCorrente.getSaldo());
        contaPoupanca.rendimento(contaPoupanca.getSaldo());

    }

}
