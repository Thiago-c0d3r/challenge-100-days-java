package day11.createDay11;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        ArrayList <Animal> listaAnimais = new ArrayList<>();

        Animal gato1 = new Gato();
        Animal cachorro1 = new Cachorro();
        Animal leao1 = new Leao();

        listaAnimais.add(gato1);
        listaAnimais.add(cachorro1);
        listaAnimais.add(leao1);

        for( Animal animal : listaAnimais){
            animal.fazerSom();
        }

    }

}
