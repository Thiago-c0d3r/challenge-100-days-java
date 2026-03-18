package day4;

import java.util.HashMap;

public class HashMapDay4 {
    public static void main(String[] args) {
        HashMap<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Thiago");
        usuarios.put(2, "Esabele");
        usuarios.put(3, "Leandro");

        int procurado = 2;

        if (usuarios.containsKey(procurado)) {
            System.out.println("Usuário: " + usuarios.get(procurado));
        } else {
            System.out.println("Usuário não encontrado!");
        }

    }
}
