package day11;

abstract class Personagem {
    private String nome;
    private int nivel = 0;
    private double hp = 100;
    private double dano = 4;
    private boolean vivo = hp > 0;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getDano() {
        return dano;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    double tomarDano(int dano){

        hp = hp - dano;
        return hp;

    }

    void Morto(){

        if (!vivo)  {
          dano = 5;
          nivel = 0;
          System.out.println("Morreu...");
        }

    }

    void exibirStatus(){
        System.out.println( "Nome: " + getNome() );
        System.out.println( "Nível: " + getNivel() );
        System.out.println( "HP: " + getHp() );
        System.out.println( "Dano: " + getDano() );
        System.out.println( "Status: " + isVivo());
    }



}
