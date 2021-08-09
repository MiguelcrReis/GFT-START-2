package Ex03;

public class Main {

    public static void main(String[] args) {
        int anoAtual = 2022;
        int aposentar = 0;
        Jogador[] jogadores = new Jogador[5];

        jogadores[0] = new Jogador("Kaio Jorge", "Atacante", 10, 10, 1999);

        /*jogadores[1] = new Jogador("Viniciu", "Defesa", "10/10/1999");
        jogadores[2] = new Jogador("Rafael", "Defesa", "10/10/1999");
        jogadores[3] = new Jogador("Neymar", "Meio-Campo", "10/10/1999");
        jogadores[4] = new Jogador("Gabriel", "Atacante", "10/10/1999");
        */

        System.out.println(jogadores[0].toString());
        jogadores[0].calcularIdade(jogadores[0].getAnoNasc());
        jogadores[0].calcularAposentadoria(jogadores[0].getPosicao(), jogadores[0].getAnoNasc());
    }
}
