import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int jogador;
    
   for(int i = 1; i<5; i++){
    int computador = (int) (Math.random()*3+ 1);

    System.out.print("Insira: \n");
    System.out.print("1. Pedra \n");
    System.out.print("2. Pael \n");
    System.out.print("3.Tesoura \n");

    Scanner input = new Scanner(System.in);
    jogador = input.nextInt();

    if(jogador == 1 && computador == 1){
      System.out.println("Empate");
    }

    if(jogador == 1 && computador == 2){
      System.out.println("Perdeu");
    }

    if(jogador == 1 && computador == 3){
      System.out.println("Ganhou");
    }

    if(jogador == 2 && computador == 2){
      System.out.println("Empate");
    }

    if(jogador == 2 && computador == 1){
      System.out.println("Ganhou");
    }

    if(jogador == 2 && computador == 3){
      System.out.println("Perdeu");
    }

    if(jogador == 3 && computador == 3){
      System.out.println("Empate");
    }

    if(jogador == 3 && computador == 1){
      System.out.println("Perdeu");
    }

     if(jogador == 3 && computador == 2){
      System.out.println("Ganhou");
    }
  }
  }
    
    
}