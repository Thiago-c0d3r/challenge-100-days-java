package day5;

public class Cadastro {
    static void cadastrar(String email, String senha){
        if (Dados.usuarios.containsKey(email)){
            System.out.println("Usuário já existe!");
            return;
        }

        Dados.usuarios.put(email,senha);
        System.out.println("Usuário cadastrado com sucesso!");
    }
}
