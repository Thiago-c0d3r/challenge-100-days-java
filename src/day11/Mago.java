package day11;

public class Mago extends Personagem {

    private double poderMagico;

    public Mago(double hp, double dano){
        setDano(14);
        setHp(85);
    }

    void conjurarMagia(int magia){

        switch (magia){
            case 1:
                System.out.println("Magia de Água");
                poderMagico = 10;
                break;

            case 2:
                System.out.println("Magia de Fogo");
                poderMagico = 10;
                break;

            case 3:
                System.out.println("Magia das Estrelas");
                poderMagico = 10;
                break;

            default:
                System.out.println("Ataque Básico");
                poderMagico = 5;
        }
    }



    @Override
    double tomarDano(double dano) {
        return 0;
    }
}
