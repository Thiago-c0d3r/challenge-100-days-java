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
        boolean sucesso=false;
        while (!sucesso){
        System.out.println("\n=== LOGIN ===");

        System.out.print("Email: ");
        String emailLogin = scan.nextLine();

        System.out.print("Senha: ");
        String senhaLogin = scan.nextLine();

        sucesso = Login.autenticar(emailLogin, senhaLogin);

        if (sucesso) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Login inválido. Tente novamente!");
        }

        }
        scan.close();
    }
}
