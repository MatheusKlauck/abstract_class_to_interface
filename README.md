# abstract_class_to_interface
Projeto visando o aprendizado da implementação de interfaces.

O projeto inicia implementando uma classe abstrata. O objetivo é melhorar o código utilizando interfaces.

**Interface:**
  - um esboço do que que quaisquer classes que a implementarem devem seguir *(constantes ou métodos)*;
  - é agnóstica quanto à lógica interna dos métodos, logo, não diz como fazer as coisas. Apenas diz o que precisa ser feito;
  - utilizada quando queremos garantir o fluxo correto das informações, mas não queremos explicitar as classes exigidas para cumprir o fluxo. Daí
    o baixo desacoplamento do código;
  - apenas um padrão para as classes. Não implementa nada;
  - métodos e propriedades são declaradas como public (por padrão).

Os mecanismos que aceitarem uma interface como parâmetro *(construtores, funções)* declaram *"Eu aceito quaisquer objetos que implementam essa interface aqui ..."*.
E dentro desses mecanismos é esperado que seja utilizada algum método ou propriedade declarados na interface XYZ.

**Classe abstrata:**
  - pode dizer não apenas como a sub classe deve se parecer, mas também, como deve se comportar; pois permite implementar lógica interna nos métodos não abstratos;
  - métodos e propriedades podem ser definidos como private, protected ou public;
  - possui construtor;
    
    **Uma classe define quem você é. Uma interface define quais papéis você pode desempenhar.**
    
Uma classe filha pode extender apenas uma superclasse (concreta ou abstrata), mas pode implementar diversas interfaces;
Uma classe filha pode escolher a visibilidade dos métodos herdados da classe abstrata, enquanto todos os métodos implementados da interface devem ser públicos.

fonte da pesquisa: https://stackoverflow.com/questions/1913098/what-is-the-difference-between-an-interface-and-abstract-class
