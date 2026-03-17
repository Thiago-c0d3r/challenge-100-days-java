package day2;
import java.util.ArrayList;


public class ArrayListDay2 {
    public static void main(String[] args) {
        ArrayList<String> animais = new ArrayList<>();
        //array com espaço infinito do tipo string,
        //chamado animais.

        //add dados
        animais.add("Leão");
        animais.add("Coruja");
        animais.add("Pantera");

        //acessando dados
        System.out.println(animais.get(0));
        System.out.println(animais.get(1));

        //percorrendo dados
        for (int i = 0; i < animais.size(); i++) {
            System.out.println(animais.get(i));
        }
        //percorrendo usando forEach
        for ( String animal : animais ) {
            System.out.println(animal);
        }
        //*array usa ".length" ArrayList usa ".size()"

        animais.remove(2);
        //serve para deletar um item da lista, identifica
        //pelo index


    }
}