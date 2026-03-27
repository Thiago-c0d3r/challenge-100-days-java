#### PROBLEMA
imagine um sistema de RH de hospital, onde todos funcionários tem:
- Nome
- CPF
- Matrícula
- Salário
- e todos Batem Ponto( );
agora pense se pra cada funcionário que vc fosse cadastrar, vc tivesse que copiar esses campos pra cada um. Problema, já pensou se decidem adicionar um campo "email"? ia ter que colocar email um de cada vez kkkk, e se esquecer de colocar? enfim mts problemas...

#### SOLUÇÃO
Herança... você escreve uma vez na super class partindo de algo mais genérico (oq todos tem em comum) e as outras classes que herdarem da super, partindo de coisas mais específicas, mas que tem as características genéricas da super, recebem da super class

#### "É UM..."
antes de aplicar a herança, precisa existir a relação "é um" entre super class e classes filhas -> classe filha "é um(a)" super class? se a resposta for sim a herança faz sentido

exemplo:
médico "é um" funcionário? ✅sim, herança aqui vai fazer sentido

#### termos chave:
extends = uma classe herda(extends) de outra classe
super() = chama construtor da super class
super.metodo() = chama método da super class
super class = molde para as outras classes
subclass = herdam da super e seguem o molde

#### oq a subclass herda?
- ✅ Atributos `public` e `protected`
- ✅ Métodos `public` e `protected`
- ❌ Atributos `private` — existem no objeto, mas só acessíveis via getters/setters
- ❌ Construtores — **não são herdados**, mas são chamados via `super()`


