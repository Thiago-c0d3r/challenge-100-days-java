#### Problema
até agora, nos nossos códigos tudo é organizado na main ou em uma única classe, com isso o código vira bagunça e não fica organizado.

imagine um programa com 100 funcionalidades, vai guardar 1000 linhas de código em uma única classe. resultado: ninguém entende, impossível manter, bug atrás de bug.

#### Solução
- DIVIDIR RESPONSABILIDADES
##### analogia:
pense num restaurante:
	
	o cozinheiro -> cozinha
	caixa -> cobra
	entregador -> faz as entregas
a ideia é que cada um faz uma coisa, errado seria uma pessoa fzr tudo;

##### no java:
antes main cuidava de tudo, agora teremos uma class pra cada responsabilidade:

	Main -> controla fluxo
	Cadastro -> cria usuário
	Login -> valida usuário
	Dados -> armazenar usuários
cada classe com UMA responsabilidade (SRP = Single Responsibility Principle)
