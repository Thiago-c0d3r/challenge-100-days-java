package day12.createDay12;

public abstract class Notificacao {
    private String destinatario;
    private String mensagem;



    public abstract void enviar();
    public abstract String getCanal();

    public void registrarEnvio(){
        System.out.println("Destinatário: " + destinatario);
        System.out.println("Canal: " + getCanal());

        System.out.println("-- MENSAGEM --");
        System.out.println(mensagem);
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
