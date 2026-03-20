package day5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // cadastro
        System.out.println("=== CADASTRO ===");
        System.out.print("Email: ");
        String email = scan.nextLine();

        System.out.print("Senha: ");
        String senha = scan.nextLine();

        Cadastro.cadastrar(email, senha);

        // login
        System.out.println("\n=== LOGIN ===");

        System.out.print("Email: ");
        String emailLogin = scan.nextLine();

        System.out.print("Senha: ");
        String senhaLogin = scan.nextLine();

        boolean sucesso = Login.autenticar(emailLogin, senhaLogin);

        if (sucesso) {
            System.out.println("Login OK");
        } else {
            System.out.println("Login inválido");
        }

        scan.close();
    }
}
