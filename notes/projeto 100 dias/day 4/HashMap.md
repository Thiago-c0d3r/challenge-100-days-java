#### Problema
ontem vimos sobre busca linear, e foi possível notar, que esse tipo de
busca não é o ideal ao pensarmos em escalabilidade, devido a sua 
complexidade=>O(n). 
#### Solução
Hoje iremos aprender uma forma de procurar sem precisar comparar dado
por dado, e ter um acesso direto ao q desejamos, pois existe diferença entre
procurar(busca linear) e acessar diretamente(HashMap)

Ideia do HashMap
invés de criar o array cru => [ "Leão", "Pantera", "Coruja" ];

agr vc cria um array com identificadores/chaves veja:
"Leão" → 1
"Pantera" → 2
"Coruja" → 3


