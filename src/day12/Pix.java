package day12;

public class Pix extends Pagamento {
    private String chave;

    public Pix(String cliente, double valor, String chave) {
        super(cliente, valor);
        this.chave = chave;
    }

    @Override
    public void processar() {
        System.out.println("[PIX] Processando pagamento...");
        System.out.println("  Chave PIX: " + chave);
        System.out.println("  Transferência instantânea. Concluído!");
    }

    @Override
    public String getTipo() {
        return "PIX";
    }
}
