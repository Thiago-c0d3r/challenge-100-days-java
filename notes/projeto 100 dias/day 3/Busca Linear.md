consiste em verificar cada elemento até encontrar oq vc quer
#### pq linear?
o nome é linear pq vc segue uma ordem linear, um por um, até achar
o valor desejado
#### ESTRUTURA DA BUSCA LINEAR
- 1° = coleção de dados (array)
- 2° = definir o valor que vc quer encontrar
- 3° = um loop para percorrer o array em busca do seu dado
- 4° = comparação, vai comparar cada dado do array com oq vc quer 
- 5° = stop, achou oq queria, encerra o laço
#### COMPLEXIDADE 
a definição simples é:
"Quanto o tempo gasto cresce, conforme os dados crescem?"
para busca linear a complexidade é:
	O(n) => quanto mais dados, mais tempo gasto
	n = quantidade de elementos
	ou seja, o tempo cresce na mesma proporção dos dados
EX:
	existe um sistema de pedidos, os pedidos estão guardados em lista
	(ArrayList) são mais de 100 pedidos, veja como funciona a complexidade:

			dependendo do pedido que vc for buscar, essa lista
			vai ter que ser percorrida até achar: se for mais 
			no começo, mais simples; se for mais pro final, mais
			complexo e gastará mais tempo;


