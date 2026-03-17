### Problema e Solução
arrays vem para resolver o problema de ter criar várias variáveis, ao invés disso criamos o array que é como uma caixa que guarda vários valores do mesmo tipo.

### em java:
`String[] animais = {"Leão", "Tigre", "Elefante", "Macaco"};`
os valores do array eles ficam coladinhos na memória

#### índice
dentro de um array cada valor tem sua posição identificada por índices que começam em 0
essa contagem parte do seguinte principio: o indice representa a distância da posição atual para o primeiro elemento do array

EX:
animais[0] ("Leão")
animais[1] ("Tigre)
animais[2] ("Elefante")
... e assim por diante

#### Criando Array em Java
1.primeira forma:
`int [ ] numeros = new int[5];`
isso cria um array com 5 slots

2.segunda forma
int[ ] numeros= {10, 20, 30, 40};

#### Acessar/Alterar
para acessar um valor específico dentro do array:
nomeArray [indice]
ex:
`System.out.println(numeros[2]);` // vai retornar 30

para alterar:
nomeArray[indice] = valorNovo;
ex:
`numeros[0]=1;` o valor do índice 0(10) agora vai valer 1

#### Acessar todos valores do array (for)
para acessar todos os valores usamos o loop for dessa forma:
`for(int i = 0; i < numeros.length; i++){`
    `System.out.println(numeros[i]);`
`}` 
a lógica é que o i(contador) ele começa em 0 e cresce até o tamanho do array(.length)
*tamanho do array é o valor de elementos dentro do array, mas não é o
mesmo valor do último índice do array*

### Importância dos Arrays
Tudo dentro do universo backend gira em torno de coleções de dados, mesmo que comecem a aparecer estruturas mais complexas, a base sempre será arrays




