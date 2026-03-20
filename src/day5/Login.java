package day5;

public class Login {
    static boolean autenticar(String email, String senha){
        if (!Dados.usuarios.containsKey(email)){
            return false;
        }
        return Dados.usuarios.get(email).equals(senha);
    }
}
