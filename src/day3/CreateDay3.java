package day3;

import java.util.ArrayList;

public class CreateDay3 {
    public static void main(String[] args) {

        ArrayList<String> biblioteca = new ArrayList<>();

        biblioteca.add("Diário de um Banana");
        biblioteca.add("Pequeno Príncipe");
        biblioteca.add("Fundamentos de Java");
        biblioteca.add("Introdução Machine Learning");

        String busca = "Fundamentos de Java";
        int comparacoes = 0;
        boolean encontrado = false;

        for (String livro : biblioteca) {
            comparacoes++;

            if (livro.equals(busca)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("encontrado!");
        } else {
            System.out.println("não encontrado!");
        }

        System.out.println("Total de itens pesquisados: " + comparacoes);

    }
}
