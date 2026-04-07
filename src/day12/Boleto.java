package day12;

public class Boleto extends Pagamento {
    private String codigoBarras;
    private String vencimento;

    public Boleto (String cliente, double valor, String codigoBarras, String vencimento){
        super(cliente, valor);
        this.codigoBarras = codigoBarras;
        this.vencimento = vencimento;
    }

    @Override
    public void processar() {
        System.out.println("[BOLETO] Processando pagamento...");
        System.out.println("  Código de barras: " + codigoBarras);
        System.out.println("  Vencimento: " + vencimento);
        System.out.println("  Compensação em até 3 dias úteis.");
    }

    @Override
    public String getTipo() {
        return "Boleto Bancário";
    }
}
//enquanto não implementasse os métodos abstratos "processar" e "getTipo"
//ia continuar dando erro dentro dessa classe filha