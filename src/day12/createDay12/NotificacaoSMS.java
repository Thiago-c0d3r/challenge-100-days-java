package day12.createDay12;

import java.util.Scanner;

public class NotificacaoSMS extends Notificacao {

    @Override
    public void enviar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o destinatário: ");
        String destinatario = scan.nextLine();
        System.out.println("Digite a mensagem: ");
        String msgSMS = scan.nextLine();

        setDestinatario(destinatario);
        setMensagem(msgSMS);

        System.out.println("Enviado!");
    }

    @Override
    public String getCanal() {
        return "SMS";
    }
}
