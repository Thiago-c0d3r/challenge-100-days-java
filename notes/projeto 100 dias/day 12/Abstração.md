modelo para ser usado, o molde apenas, não foi feito pra ser instanciado, 
não é correto criar objetos a partir de classes genéricas.

isso se faz presente nas heranças, a ideia é q vc nunca deve instanciar a super class, pq ela é apenas o molde da forma como as outras classes filhas podem se comportar

o abstract vem justamente pra impedir esse instanciamento

existe tb abstract em métodos, isso faz com q o método possa ter escopo vazio, mas todas as classes filhas vão ter que ter esse método abstrato