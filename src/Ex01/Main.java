package Ex01;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int op = 0;
        int j = 100;
        int boazinhas = 0, malvadas = 0;
        Scanner scan = new Scanner(System.in);

        ArrayList<Crianca> criancas = new ArrayList<>();

        do {

            //System.out.println();
            System.out.print("Nome da Criança: ");
            String nome = scan.nextLine();

            System.out.println();
            System.out.println("Foi uma criança Boazinha ou Malvada?\n[1] - Boazinha | [2] - Malvada");
            int opcao = scan.nextInt();
            String personalidade;
            if (opcao == 1) {
                personalidade = "Boazinha";
                System.out.println("Recebeu Presente!!!");
            } else {
                personalidade = "Malvada";
                System.out.println("Não recebeu Presente!!!");
            }
            criancas.add(new Crianca(nome, personalidade));

            System.out.println("Deseja cadastrar outra Criança?\n[1] - Sim | [2] - Não ");
            op = scan.nextInt();
        }while(op != 2);

        for (int i = 0; i < criancas.toArray().length; i++){
            if (criancas.get(i).getPersonalidade().equals("Boazinha")){
                boazinhas++;
            }else{
                malvadas++;
            }
        }
        System.out.println("Crianças que receberam presentes: "+boazinhas);
        System.out.println("Crianças que NÃO receberam presentes: "+malvadas);

    }
}
