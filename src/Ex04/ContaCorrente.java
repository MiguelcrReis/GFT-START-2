package Ex04;

public class ContaCorrente extends Conta{

    public ContaCorrente(int numero, String titular, float saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public void rendimento(float saldo) {
        super.rendimento(saldo);
        System.out.println("Conta Corrente");
        System.out.println("Rendimento: "+(saldo*0.05));
        System.out.println("Saldo Total: "+(saldo+saldo*0.05));
    }
}
