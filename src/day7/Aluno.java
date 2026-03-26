package day7;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        while (nome.equals("")) {
            if (!nome.equals("")) {
                this.nome = nome;
            } else {
                System.out.println("Nome inválido!");
            }
        }
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        while(nota1<0 || nota1>10) {
            if (nota1 >= 0 && nota1 <= 10) {
                this.nota1 = nota1;
            } else {
                System.out.println("Nota inválida!");
            }
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        while(nota2<0 || nota2>10) {
            if (nota2 >= 0 && nota2 <= 10) {
                this.nota2 = nota2;
            } else {
                System.out.println("Nota inválida!");
            }
        }
    }

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

    public Aluno(String nome, double nota1, double nota2) {
        if(nome.equals("")){
            System.out.println("Nome inválido!");
        }else{
            this.nome = nome;
        }
        if(nota1<0 || nota1>10){
            System.out.println("Nota inválida!");
        }else{
            this.nota1 = nota1;
        }

        if(nota1<0 || nota1>10){
            System.out.println("Nota inválida!");
        }else{
            this.nota2 = nota2;
        }


    }
}
