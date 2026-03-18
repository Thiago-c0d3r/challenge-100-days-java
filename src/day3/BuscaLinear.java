package day3;

import java.util.ArrayList;

public class BuscaLinear {
    public static void main(String[] args) {
        ArrayList<String> catalogoFilmes = new ArrayList<>();

        catalogoFilmes.add("Creed");
        catalogoFilmes.add("Homem-Aranha");
        catalogoFilmes.add("Batman");

        String busca = "Homem-Aranha";
        for (String filmes : catalogoFilmes) {
            if (filmes.equals(busca)) {
                System.out.println("Encontrado!");
                break;
            }
        }
    }
}
