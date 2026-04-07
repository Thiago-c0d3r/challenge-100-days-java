package day12;

public class Main {
    public static void main(String[] args) {

        //criando variáveis pra cada tipo, pois vamos referenciá-las
        Pagamento boleto = new Boleto("Esabele Matos", 350.59,
                "34191.79001 01043.510047" ,"15/04/2026");

        Pagamento pix     = new Pix("Leandro Martinho", 89.90,
                "carlos@email.com");

        Pagamento cartao  = new CartaoCredito("Thiago Sousa", 1200.0,
                "1234567890123456", 6);

        Pagamento[] pagamentos = { boleto, pix, cartao };

        for (Pagamento p : pagamentos) {
            p.processar();
            p.exibirComprovante();
            System.out.println();
        }

        //calculando fatura total, os débitos de todos os pagamentos

        double total = 0;
        for (Pagamento p : pagamentos){
            total += p.getValor();
        }
        System.out.println("Total da fatura: R$ "+
                            String.format("%.2f",total));
    }

}


