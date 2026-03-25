package day6;

import java.util.ArrayList;

public class main {
    static void main(String[] args) {

        ArrayList<User> usuarios = new ArrayList<>();

        User u1 = new User();
        u1.email = "thiago@gmail.com";
        u1.senha = "123";


        User u2 = new User();
        u2.email = "esabele@gmail.com";
        u2.senha = "456";

        User u3 = new User();
        u3.email = "leandro@gmail.com";
        u3.senha = "789";

        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);

        //esse for-each abaixo funciona assim:
        /*
        a ideia do for-each = "para cada"
        1. cria uma variavel "u" do tipo/classe User
        2. ":usuarios" significa que vai percorrer o hashmap usuarios
        ou seja, esse for-each vai percorrer cada objeto da class
        User

         */
        for (User u : usuarios){
            System.out.println(u.email);
            System.out.println(u.senha);
        }//esse foreach é usado para acessarmos objetos e arrays
        System.out.println("Total de Usuários: "+usuarios.size());

        String busca = "thiago@gmail.com";
        boolean encontrado= false;
        for (User u : usuarios){
            if(u.email.equals(busca)){
                encontrado=true;
                System.out.println("encontrado!");
            }
        }
        if(!encontrado){
            System.out.println("usuário não encontrado!");
        }


        //ideia: pra cada objeto da class User, dentro do hashmap
        //usuarios, faça: mostrar email e mostrar senha

    }
}
