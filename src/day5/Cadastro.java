package day5;

public class Cadastro {
    static void cadastrar(String email, String senha){
        if (Dados.usuarios.containsKey(email)){
            System.out.println("Usuário já existe!");
            return;
        }//primeiro a validação pra ver se n tem ngm com esse email q ta sendo
        // cadastrado

        Dados.usuarios.put(email,senha);//dps da validação, aí sim pode seguir pra colocar no hashmap
        System.out.println("Usuário cadastrado com sucesso!");
    }
}
