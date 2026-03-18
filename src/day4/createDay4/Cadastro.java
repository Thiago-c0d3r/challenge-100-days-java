package day4.createDay4;

import java.util.HashMap;
import java.util.Scanner;

public class Cadastro {
    static String email;
    static String senha;

    static void cadastrar(){
        Scanner scan= new Scanner(System.in);

        System.out.println("Digite seu E-mail: ");
        email= scan.nextLine();

        System.out.println("Digite sua Senha: ");
        senha= scan.nextLine();
        HashMap<String, String> usuarios = new HashMap<>();
        usuarios.put( senha,email );
    }

    static void getCadastro(){
        System.out.println("Usuário Cadastrado");
        System.out.println("Email: "+ email);
        System.out.println("Senha: "+ senha);

    }
}
