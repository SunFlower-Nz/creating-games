import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int escolhajogador;
    int numerojogador;
    int numerocomputador = (int) (Math.random()*10 + 1);
    Scanner input = new Scanner(System.in);

    int placarInimigo = 0;
    int placarJogador = 0; 

    for(int i = 1; i<=3; i++){
        int computador = (int) (Math.random()*3 + 1);
        System.out.print("PAR OU ÍMPAR \n");
        System.out.print("Escolha (1) para ÍMPAR e (2) para PAR: ");
        escolhajogador = input.nextInt();
        System.out.print("Escolha um número para jogada: ");
        numerojogador = input.nextInt();
    
        int soma = numerojogador + numerocomputador;
        int verifica = soma % 2;


        //Melhor de 3
        if(escolhajogador == 1 && verifica != 0){
            System.out.print("----- ÍMPAR ------ \n");
            placarJogador++;
            System.out.print("Jogador: " + numerojogador + "\n");
            System.out.print("Computador: " + numerocomputador + "\n");
            System.out.print("Você ganhou!\n");
            System.out.print("Jogador:" + placarJogador +"\n"+ "Computador:" + placarInimigo + "\n");
        //Placar
        }
        else if(escolhajogador == 1 && verifica == 0){
            System.out.print("----- PAR ------ \n");
            placarInimigo++;
            System.out.print("Jogador: " + numerojogador + "\n");
            System.out.print("Computador: " + numerocomputador + "\n");
            System.out.print("Você perdeu!\n");
            System.out.print("Jogador:" + placarJogador +"\n"+ "Computador:" + placarInimigo + "\n");
        }

        else if(escolhajogador == 2 && verifica != 0){
            System.out.print("----- PAR ------ \n");
            placarInimigo++;
            System.out.print("Jogador: " + numerojogador + "\n");
            System.out.print("Computador: " + numerocomputador + "\n");
            System.out.print("Você perdeu!\n");
            System.out.print("Jogador:" + placarJogador +"\n"+ "Computador:" + placarInimigo + "\n");
        }

        else if (escolhajogador == 2 && verifica == 0){
            System.out.print("----- ÍMPAR ------ \n");
            placarJogador++;
            System.out.print("Jogador: " + numerojogador + "\n");
            System.out.print("Computador: " + numerocomputador + "\n");
            System.out.print("Você ganhou!\n");
            System.out.print("Jogador:" + placarJogador +"\n"+ "Computador:" + placarInimigo + "\n");
        }
        //Exibir o placar
    }
  }
  
}
