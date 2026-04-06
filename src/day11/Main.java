package day11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo ao campo de batalha!");
        System.out.println("");

        System.out.println("escolha qual classe de personagem deseja usar: ");
        System.out.println("1- guerreiro");
        System.out.println("2- mago");

        System.out.println("Qual o nome do seu personagem?");
        String nome = scan.nextLine();

        int escolha = scan.nextInt();

        if (escolha == 1){
            Personagem a = new Guerreiro(140,10);
            System.out.println("Guerreiro criado");
            a.setNome(nome);
            a.exibirStatus();
        } else if (escolha == 2) {
            Personagem b = new Mago(80, 20);
            System.out.println("Mago criado");
            b.setNome(nome);
            b.exibirStatus();
        }

        System.out.println("Quem vc deseja enfrentar?");







    }

}
