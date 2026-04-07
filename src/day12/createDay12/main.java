package day12.createDay12;

public class main {
    public static void main(String[] args) {
        Notificacao[] listaNotificacao= {
                new NotificacaoSMS(),
                new NotificacaoEmail()
        };

        for (Notificacao n : listaNotificacao){
            n.enviar();
            n.registrarEnvio();
        }
    }
}
