package day2;

import java.util.ArrayList;

public class CreateDay2 {
    public static void main(String[] args){
        // lista dinâmica de pedidos de comida
        ArrayList<String> pedidos= new ArrayList<>();
        pedidos.add("Pizza");
        pedidos.add("Açaí");
        pedidos.add("Hamburger");
        pedidos.add("Batata Frita");
        pedidos.add("Refrigerante");
        pedidos.remove(1);

        for (String pedido: pedidos){
            System.out.println(pedido);
        }

        System.out.println("Total de Pedidos: "+ pedidos.size());

    }
}
