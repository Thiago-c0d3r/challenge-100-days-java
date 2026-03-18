package day4.createDay4;

import java.util.HashMap;
import java.util.Scanner;

import static day4.createDay4.Cadastro.email;
import static day4.createDay4.Cadastro.senha;

public class PaginaInicial {
    static void main(String[] args) {
        Scanner scan= new Scanner(System.in);


        Cadastro.cadastrar();

        Login.logar();





    }
}
