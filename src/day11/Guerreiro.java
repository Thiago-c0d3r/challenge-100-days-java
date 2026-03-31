package day11;

public class Guerreiro extends Personagem {

    private double hpAtual;

    public Guerreiro(double hp, double dano){
        setDano(10);
        setHp(140);
    }

    void tomarDano(double dano) {
        double escudoAbsorve= dano * 0.2;
        double danoSofrido = dano - escudoAbsorve;
        System.out.println( "Dano absorvido: " + escudoAbsorve);
        hpAtual = getHp() - danoSofrido;
    }
    


}
