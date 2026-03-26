package day5.CreateDay5;

public class Aluno {
    String nome;
    double nota1;
    double nota2;

    public double calcMedia(){
        double media = (nota1+nota2)/2;
        return media;
    }

    public boolean verificarAprovacao(){
        if(calcMedia()>=6){

            return true;
        }else{

            return false;
        }

    }


}
