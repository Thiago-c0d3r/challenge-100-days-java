package day7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static Aluno criarAluno(Scanner scan){

        Aluno a = new Aluno();

        System.out.println("Digite o nome do aluno");
        a.setNome(scan.nextLine());

        System.out.println("Digite a 1° nota: ");
        a.setNota1(scan.nextDouble());

        System.out.println("Digite a 2° nota: ");
        a.setNota2(scan.nextDouble());
        scan.nextLine();

        return a;//vai retornar o objeto criado;

    }

    public static void getAluno(Aluno a){

        System.out.println("====SITUAÇÃO de "+a.getNome()+"====");
        System.out.println("Nome: " + a.getNome());
        System.out.println("Média " + a.calcMedia());

        if(a.verificarAprovacao()){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado");
        }
        System.out.println("================");

    }

    public static int contarAprovados (ArrayList<Aluno> lista){
        int contador = 0;

        for (Aluno a : lista){

            if (a.verificarAprovacao()){
                contador++;
            }

        }

        return contador;

    }

    public static int contarReprovados (ArrayList<Aluno> lista){

        int contador = 0;

        for (Aluno a : lista){

            if (!a.verificarAprovacao()){
                contador++;
            }

        }

        return contador;

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        System.out.println("Digite quantos alunos deseja analisar: ");
        int qntdeAlunos = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < qntdeAlunos; i++){
            Aluno a = criarAluno(scan);
            listaAlunos.add(a);
        }

        for (Aluno a : listaAlunos){
            getAluno(a);
        }

        int totalAprovados = contarAprovados(listaAlunos);
        System.out.println("Total aprovados: " + totalAprovados);

        int totalReprovados = contarReprovados(listaAlunos);
        System.out.println("Total reprovados: " + totalReprovados);


    }
}

