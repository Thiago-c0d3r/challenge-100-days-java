package day12;

public class CartaoCredito extends Pagamento {
    private String numeroCartao;
    private int    parcelas;

    public CartaoCredito(String cliente, double valor,
                         String numeroCartao, int parcelas){
        super(cliente, valor);
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }

    @Override
    public void processar() {
        String finalCartao = numeroCartao.substring(numeroCartao.length() - 4);

        System.out.println("[CARTÃO] Processando pagamento...");
        System.out.println("  Cartão: **** **** **** " + finalCartao);
        System.out.println("  Parcelas: " + parcelas + "x de R$ " +
                String.format("%.2f", getValor() / parcelas));
    }

    @Override
    public String getTipo() {
        return "Cartão de Crédito " + parcelas + "x";
    }
}
