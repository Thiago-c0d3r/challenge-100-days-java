package day12;

public class Main {
    public static void main(String[] args) {

        //criando variáveis pra cada tipo, pois vamos referenciá-las
        Pagamento boleto = new Boleto("Esabele Matos", 350.59,
                "34191.79001 01043.510047" ,"15/04/2026");

        Pagamento pix     = new Pix("Leandro Martinho", 89.99,
                "thiago@email.com");

        Pagamento cartao  = new CartaoCredito("Thiago Sousa", 1200.0,
                "1234567890123456", 6);

        //array para todos valores serem acessador por loop
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

        System.out.printf("Total da fatura: R$ %.2f",total);
        System.out.println();
    }

}


