PROBLEMA
seu código atualmente permite qualquer um fzr alterações e acessar 
qualquer valor, sem nenhum tipo de controle.

SOLUÇÃO
encapsulamento...
ngm tem mais acesso direto
e precisa passar por um controle

para isso usa o modificador de visibilidade "private", ele permite que apenas a 
própria classe em que o atributo foi criado, possa acessá-lo

para acessar e alterar esses atributos na main, ela vai ter que usar métodos que vao ser criados na classe, chamados getters(acessar) e setters(alterar), mas são nesses métodos que o dev vai criar as regras para ter controle dentro do código.