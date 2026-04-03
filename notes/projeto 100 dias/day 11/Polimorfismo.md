trabalha nos métodos em comum

sobrescrita de método = @Override
override acontece quando uma classe filha sobrescreve método da classe pai com mesmo nome, mesmos parametros, mas com COMPORTAMENTO diferente.

@override serve como anotação para o compilador entender que vc ta sobrescrevendo intecionalmente. Sem ela, caso vc erre o nome do método da classe pai, não vai sobrescrever e vai apenas criar outro método

	`Tipo da variável → Personagem   (o compilador vê isso)`
	`Objeto real      → Guerreiro    (a JVM vê isso em runtime)`
	`Método chamado   → calcularDano() do Guerreiro  ← é o que 
												executa.

a decisão do compilador é feita em tempo de execução runtime, Isso se chama **Dynamic Dispatch** ou **Late Binding**
