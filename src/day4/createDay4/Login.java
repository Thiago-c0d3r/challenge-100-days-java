package day4.createDay4;

import java.util.Scanner;
import static day4.createDay4.Cadastro.email;
import static day4.createDay4.Cadastro.senha;

public class Login {
    static void logar(){
       boolean login=false;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("");
            System.out.println("Bem Vindo a sessão de Login!");
            System.out.println("");

            System.out.println("Digite seu email: ");
            String emailLogin = scan.nextLine();

            System.out.println("Digite sua senha: ");
            String senhaLogin = scan.nextLine();

        if (emailLogin.equals(email) && senhaLogin.equals(senha)){
            System.out.println("Login realizado com sucesso!");
            login=true;
        }else{
            System.out.println("credenciais inválidas. Tente novamente!");
        }

        }while (!login);
    }
}
