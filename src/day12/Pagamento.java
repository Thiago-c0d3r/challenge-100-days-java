package day12;

public abstract class Pagamento {

    private String cliente;
    private double valor;

    public Pagamento (String cliente, double valor){
        this.cliente = cliente;
        this.valor = valor;
    }
    //métodos abstratos que as classes filhas são obrigadas a implementar
    public abstract void processar();
    public abstract String getTipo();

    public void exibirComprovante() {
        System.out.println("============================");
        System.out.println(" COMPROVANTE DE PAGAMENTO");
        System.out.println(" Tipo:   " + getTipo());
        System.out.println("Cliente: " + cliente);
        System.out.println("Valor:   R$ "+ valor);
        System.out.println("Status:     APROVADO");
        System.out.println("============================");
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }
}
