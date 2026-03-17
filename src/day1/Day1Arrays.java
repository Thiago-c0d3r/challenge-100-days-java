package day1;

public class Day1Arrays {
    public static void main(String[] args) {




        int numeros []={10, 20, 30, 40, 50};
        int soma=0;
        for(int i=0;i<numeros.length;i++){
            soma+=numeros[i];
        }
        System.out.println("Total= "+soma);
        int maior=numeros[0];
        for (int i=0; i<numeros.length; i++){
            if(numeros[i]>maior){
                maior=numeros[i];
            }
        }
        System.out.println("Maior Número = "+maior);

        System.out.println("");

        double notas[]={9.8,10,3.9,7.3,5.3};
        double total=0;
        for (int i = 0; i < notas.length; i++) {
           total+=notas[i];
        }
        double media= total/ notas.length;
        System.out.println("Média das notas: "+media);

        System.out.println("");

        int contagem[]={1,2,3,4,5,6,7,8,9};
        int pares=0;
        int impares=0;
        for (int i = 0; i < contagem.length; i++) {
            if(contagem[i]%2==0){
                pares++;
            }else{
                impares++;
            }
        }
        System.out.println("números pares = "+pares);
        System.out.println("números ímpares = "+impares);
    }
}
