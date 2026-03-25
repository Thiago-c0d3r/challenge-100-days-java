package day5.CreateDay5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        int contador = 1;
        ArrayList <Aluno> listaAlunos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantos alunos deseja analisar: ");
        int qntdeAlunos= scan.nextInt();
        scan.nextLine();

        for (int i=0; i<qntdeAlunos; i++){
            Aluno a = new Aluno();

            System.out.println("Digite o nome do Aluno"+contador+": ");
            a.nome = scan.nextLine();

            System.out.println("Digite a 1° nota");
            a.nota1 = scan.nextDouble();

            System.out.println("Digite a 2° nota: ");
            a.nota2 = scan.nextDouble();

            listaAlunos.add(a);
            scan.nextLine();
            contador++;
        }
        contador=1;
        System.out.println("====LISTA ALUNOS====");
        for (Aluno aluno:listaAlunos){
            System.out.println("ALUNO "+contador);
            System.out.println("Nome: "+aluno.nome);
            System.out.println("Média: "+aluno.calcMedia());

            if (aluno.verificarAprovacao()){
                System.out.println("Status: Aprovado!");
            }else{
                System.out.println("Status: Reprovado!");
            }
            contador++;
            System.out.println("");
        }

    }
}
