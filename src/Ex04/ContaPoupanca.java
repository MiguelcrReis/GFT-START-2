package Ex04;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero, String titular, float saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public void rendimento(float saldo) {
        super.rendimento(saldo);
        System.out.println("Conta Poupança");
        System.out.println("Rendimento: "+saldo*0.07);
        System.out.println("Saldo Total: "+(saldo+saldo*0.07));
    }
}

