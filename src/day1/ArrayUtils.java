package day1;

public final class ArrayUtils {



    static int somar ( int [] numeros ) {
        int soma = 0;
        for ( int numero: numeros ){
            soma += numero;
        }
        return soma;
    }

    static int findMaiorNumero ( int [] numeros ){
        int maior = numeros [ 0 ];
        for ( int numero: numeros ) {
            if ( numero > maior ){
                maior = numero;
            }
        }
        return maior;
    }

    static int contarPares (int[] numeros){
        int pares = 0;
        int impares = 0;
        for ( int numero: numeros ){
            if ( numero % 2 == 0 ) {
                pares++;
            }
        }
        return pares;
    }

    static int mediaInt ( int [] numeros ){
       int total = somar ( numeros );
       int media = total / numeros.length;
       return media;
    }
}
